package com.simpleapps.symmetricalsniffle.utils

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
class ToastUtilActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(ToastUtilActivity::class.java)

    @Test
    fun activityOpen() {
        onView(withText("SMALL TOAST")).check(matches(isDisplayed()))
        onView(withText("LONG TOAST")).check(matches(isDisplayed()))
    }

    @Test
    fun showSmallToast() {
        onView(withText("SMALL TOAST")).perform(click())
        onView(withText("Small Toast")).check(matches(isDisplayed()))
    }

    @Test
    fun showLargeToast() {
        onView(withText("LONG TOAST")).perform(click())
        onView(withText("Long Toast")).check(matches(isDisplayed()))
    }
}