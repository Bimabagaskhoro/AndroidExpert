package com.bimabagaskhoro.submissionjetpactpro1.viewmodel

import androidx.lifecycle.ViewModel
import com.bimabagaskhoro.submissionjetpactpro1.data.EntityTvShow
import com.bimabagaskhoro.submissionjetpactpro1.utils.DataDummy

class DetailTvShowViewModel : ViewModel() {
    private lateinit var tvshowId: String

    fun setSelectedTvShow(tvshowId: String) {
        this.tvshowId = tvshowId
    }

    fun getTvShow(): EntityTvShow {
        lateinit var tvshow: EntityTvShow
        val tvshowEntities = DataDummy.generateDummyTvShow()
        for (tvshowEntity in tvshowEntities) {
            if (tvshowEntity.tvShowId == tvshowId) {
                tvshow = tvshowEntity
            }
        }
        return tvshow
    }
}