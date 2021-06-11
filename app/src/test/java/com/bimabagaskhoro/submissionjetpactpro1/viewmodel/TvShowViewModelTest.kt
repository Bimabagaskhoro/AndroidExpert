package com.bimabagaskhoro.submissionjetpactpro1.viewmodel

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest{
    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvSHow() {
        val entitiyMovie = viewModel.getTvSHow()
        assertNotNull(entitiyMovie)
        assertEquals(10, entitiyMovie.size)
    }
}