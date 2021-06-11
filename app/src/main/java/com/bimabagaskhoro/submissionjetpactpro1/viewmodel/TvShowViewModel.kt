package com.bimabagaskhoro.submissionjetpactpro1.viewmodel

import androidx.lifecycle.ViewModel
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityTvShow
import com.bimabagaskhoro.submissionjetpactpro1.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvSHow(): List<EntityTvShow> = DataDummy.generateDummyTvShow()
}