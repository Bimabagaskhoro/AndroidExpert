package com.bimabagaskhoro.submissionjetpactpro1.viewmodel

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {
    private lateinit var viewModel: MovieViewModel

    @Before
    fun setUp() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovie() {
        val entitiyMovie = viewModel.getMovie()
        assertNotNull(entitiyMovie)
        assertEquals(10, entitiyMovie.size)
    }
}