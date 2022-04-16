package com.simpleapps.symmetricalsniffle.adapter

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4ClassRunner::class)
class ImplRecyclerAdapterTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(ImplRecyclerAdapter::class.java)


    @Test
    fun activityIsCreated() {
        onView(withText("Nothing is selected")).check(matches(isDisplayed()))
    }

    @Test
    fun clickOnAnyItemInRecyclerView(){
        onView(withText("Test Data : 1")).perform(click())
        onView(withText("Clicked")).check(matches(isDisplayed()))
    }
}