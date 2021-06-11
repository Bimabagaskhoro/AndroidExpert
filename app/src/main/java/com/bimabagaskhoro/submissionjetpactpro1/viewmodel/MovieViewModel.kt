package com.bimabagaskhoro.submissionjetpactpro1.viewmodel

import androidx.lifecycle.ViewModel
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityMovie
import com.bimabagaskhoro.submissionjetpactpro1.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovie(): List<EntityMovie> = DataDummy.generateDummyMovie()
}