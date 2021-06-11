package com.bimabagaskhoro.submissionjetpactpro1.ui.tvshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bimabagaskhoro.submissionjetpactpro1.R
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityMovie
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityTvShow
import com.bimabagaskhoro.submissionjetpactpro1.databinding.ActivityDetailMovieBinding
import com.bimabagaskhoro.submissionjetpactpro1.databinding.ActivityDetailTvShowBinding
import com.bimabagaskhoro.submissionjetpactpro1.databinding.ContentDetailTvshowBinding
import com.bimabagaskhoro.submissionjetpactpro1.ui.movie.DetailActivityMovie
import com.bimabagaskhoro.submissionjetpactpro1.viewmodel.DetailMovieViewModel
import com.bimabagaskhoro.submissionjetpactpro1.viewmodel.DetailTvShowViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class DetailActivityTvShow : AppCompatActivity() {
    private lateinit var contentDetailTvshowBinding: ContentDetailTvshowBinding

    companion object {
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailTvShowBinding = ActivityDetailTvShowBinding.inflate(layoutInflater)
        contentDetailTvshowBinding = activityDetailTvShowBinding.detailContent

        setContentView(activityDetailTvShowBinding.root)

        val actionbar = supportActionBar
        actionbar!!.title = getString(R.string.tvshow)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailTvShowViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val tvShowId = extras.getString(EXTRA_TVSHOW)
            if (tvShowId != null) {
                viewModel.setSelectedTvShow(tvShowId)
                populateCourse(viewModel.getTvShow() as EntityTvShow)
            }
        }
    }

    private fun populateCourse(entityTvShow: EntityTvShow) {
        contentDetailTvshowBinding.textTitleTvshow.text = entityTvShow.title
        contentDetailTvshowBinding.textDescTvshow.text = entityTvShow.overview
        contentDetailTvshowBinding.textDateTvshow.text = entityTvShow.year

        Glide.with(this)
                .load(entityTvShow.imagePath)
                .transform(RoundedCorners(20))
                .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                .into(contentDetailTvshowBinding.imagePosterTvshow)
    }
}