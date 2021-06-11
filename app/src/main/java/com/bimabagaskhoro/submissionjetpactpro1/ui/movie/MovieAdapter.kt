package com.bimabagaskhoro.submissionjetpactpro1.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bimabagaskhoro.submissionjetpactpro1.R
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityMovie
import com.bimabagaskhoro.submissionjetpactpro1.databinding.ItemsMovieBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listmovie = ArrayList<EntityMovie>()

    fun setMovie(movie: List<EntityMovie>?) {
        if (movie == null) return
        this.listmovie.clear()
        this.listmovie.addAll(movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MovieViewHolder {
        val itemsMovieBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val course = listmovie[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listmovie.size

    class MovieViewHolder(private val binding: ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: EntityMovie) {
            with(binding) {
                tvItemTitle.text = movie.title
                tvItemDate.text = movie.date
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivityMovie::class.java)
                    intent.putExtra(DetailActivityMovie.EXTRA_MOVIE, movie.movieId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                        .load(movie.imagePath)
                        .apply(
                                RequestOptions.placeholderOf(R.drawable.ic_loading)
                                        .error(R.drawable.ic_error))
                        .into(imgPoster)
            }
        }
    }
}