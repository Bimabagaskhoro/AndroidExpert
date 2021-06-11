package com.bimabagaskhoro.submissionjetpactpro1.viewmodel

import androidx.lifecycle.ViewModel
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityMovie
import com.bimabagaskhoro.submissionjetpactpro1.utils.DataDummy

class DetailMovieViewModel : ViewModel() {
    private lateinit var movieId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): EntityMovie {
        lateinit var movie: EntityMovie
        val movieEntities = DataDummy.generateDummyMovie()
        for (movieEntity in movieEntities) {
            if (movieEntity.movieId == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }
}