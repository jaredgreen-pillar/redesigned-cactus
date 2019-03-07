package com.example.redesignedcactus

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var mainActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun progressButtonHasText() {
        onView(withId(R.id.progressButton)).check(matches(withText("Increment Progress")))
    }

    @Test
    fun counterLabelHasDefaultTextOfZero() {
        onView(withId(R.id.progressCounter)).check(matches(withText("0")))
    }

    @Test
    fun whenProgressButtonClickedThenCounterLabelIncrementsByOne() {
        onView(withId(R.id.progressButton)).perform(click())
        onView(withId(R.id.progressCounter)).check(matches(withText("1")))
    }

    @Test
    fun whenProgressButtonClickedMultipleTimesTheCounterLabelIncrementsByOneForEachClick() {
        onView(withId(R.id.progressButton)).perform(click())
        onView(withId(R.id.progressButton)).perform(click())
        onView(withId(R.id.progressButton)).perform(click())
        onView(withId(R.id.progressCounter)).check(matches(withText("3")))
    }
}