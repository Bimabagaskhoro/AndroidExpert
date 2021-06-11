package com.bimabagaskhoro.submissionjetpactpro1.viewmodel

import com.bimabagaskhoro.submissionjetpactpro1.utils.DataDummy
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import org.junit.Before
import org.junit.Test

class DetailMovieViewModelTest {
    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val movieId = dummyMovie.movieId

    @Before
    fun set() {
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedMovie(movieId)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dummyMovie.movieId)
        val detailMovie = viewModel.getMovie()
        assertNotNull(detailMovie)
        assertEquals(dummyMovie.movieId, detailMovie.movieId)
        assertEquals(dummyMovie.title, detailMovie.title)
        assertEquals(dummyMovie.date, detailMovie.date)
        assertEquals(dummyMovie.overview, detailMovie.overview)
        assertEquals(dummyMovie.imagePath, detailMovie.imagePath)
    }
}