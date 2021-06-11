package com.bimabagaskhoro.submissionjetpactpro1.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.bimabagaskhoro.submissionjetpactpro1.R
import com.bimabagaskhoro.submissionjetpactpro1.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    private val movieDummy = DataDummy.generateDummyMovie()
    private val tvShowDummy = DataDummy.generateDummyTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movieDummy.size))
    }

    @Test
    fun loadTvShow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tvShowDummy.size))
    }

    @Test
    fun loadMovieDetail() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.text_title_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title_movie)).check(matches(withText(movieDummy[0].title)))
        onView(withId(R.id.text_date_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.text_date_movie)).check(matches(withText(movieDummy[0].date)))
        onView(withId(R.id.text_desc_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.text_desc_movie)).check(matches(withText(movieDummy[0].overview)))
    }

    @Test
    fun loadTvShowDetail() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.text_title_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title_tvshow)).check(matches(withText(tvShowDummy[0].title)))
        onView(withId(R.id.text_date_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.text_date_tvshow)).check(matches(withText(tvShowDummy[0].year)))
        onView(withId(R.id.text_desc_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.text_desc_tvshow)).check(matches(withText(tvShowDummy[0].overview)))
    }
}