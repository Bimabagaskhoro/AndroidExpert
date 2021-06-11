package com.bimabagaskhoro.submissionjetpactpro1.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bimabagaskhoro.submissionjetpactpro1.R
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityTvShow
import com.bimabagaskhoro.submissionjetpactpro1.databinding.ItemsTvshowBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {
    private var listTvShow = ArrayList<EntityTvShow>()

    fun setTvShow(courses: List<EntityTvShow>?) {
        if (courses == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(courses)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowAdapter.TvShowViewHolder {
        val itemsTvshowBinding = ItemsTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvshowBinding)
    }

    override fun onBindViewHolder(holder: TvShowAdapter.TvShowViewHolder, position: Int) {
        val course = listTvShow[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listTvShow.size

    class TvShowViewHolder(private val binding: ItemsTvshowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: EntityTvShow) {
            with(binding) {
                tvItemTitle.text = tvshow.title
                tvItemDate.text = tvshow.year
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivityTvShow::class.java)
                    intent.putExtra(DetailActivityTvShow.EXTRA_TVSHOW, tvshow.tvShowId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                        .load(tvshow.imagePath)
                        .apply(
                                RequestOptions.placeholderOf(R.drawable.ic_loading)
                                        .error(R.drawable.ic_error))
                        .into(imgPoster)
            }
        }
    }
}