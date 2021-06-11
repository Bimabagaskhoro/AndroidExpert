package com.bimabagaskhoro.submissionjetpactpro1.viewmodel

import com.bimabagaskhoro.submissionjetpactpro1.utils.DataDummy
import junit.framework.TestCase
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DetailTvShowViewModelTest {
    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyTvshow = DataDummy.generateDummyTvShow()[0]
    private val tvShowId = dummyTvshow.tvShowId

    @Before
    fun set() {
        viewModel = DetailTvShowViewModel()
        viewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedTvShow(dummyTvshow.tvShowId)
        val detailTvShow = viewModel.getTvShow()
        TestCase.assertNotNull(detailTvShow)
        TestCase.assertEquals(dummyTvshow.tvShowId, detailTvShow.tvShowId)
        TestCase.assertEquals(dummyTvshow.title, detailTvShow.title)
        TestCase.assertEquals(dummyTvshow.year, detailTvShow.year)
        TestCase.assertEquals(dummyTvshow.overview, detailTvShow.overview)
        TestCase.assertEquals(dummyTvshow.imagePath, detailTvShow.imagePath)
    }
}