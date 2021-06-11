package com.bimabagaskhoro.submissionjetpactpro1.ui.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bimabagaskhoro.submissionjetpactpro1.R
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityMovie
import com.bimabagaskhoro.submissionjetpactpro1.databinding.ActivityDetailMovieBinding
import com.bimabagaskhoro.submissionjetpactpro1.databinding.ContentDetailMovieBinding
import com.bimabagaskhoro.submissionjetpactpro1.viewmodel.DetailMovieViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class DetailActivityMovie : AppCompatActivity() {
    private lateinit var contentDetailMovieBinding: ContentDetailMovieBinding

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailMovieBinding = ActivityDetailMovieBinding.inflate(layoutInflater)
        contentDetailMovieBinding = activityDetailMovieBinding.detailContent

        setContentView(activityDetailMovieBinding.root)

        val actionbar = supportActionBar
        actionbar!!.title = getString(R.string.movie)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_MOVIE)
            if (movieId != null) {
                viewModel.setSelectedMovie(movieId)
                populateCourse(viewModel.getMovie() as EntityMovie)
            }
        }
    }

    private fun populateCourse(entityMovie: EntityMovie) {
        contentDetailMovieBinding.textTitleMovie.text = entityMovie.title
        contentDetailMovieBinding.textDescMovie.text = entityMovie.overview
        contentDetailMovieBinding.textDateMovie.text = entityMovie.date

        Glide.with(this)
                .load(entityMovie.imagePath)
                .transform(RoundedCorners(20))
                .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                .into(contentDetailMovieBinding.imagePosterMovie)
    }
}