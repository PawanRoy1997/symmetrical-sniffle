package com.simpleapps.symmetricalsniffle.activities

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ImplBaseActivityTest {
    val buttonPress = "Button Is Pressed"

    @get:Rule
    val activityRule = ActivityScenarioRule(ImplBaseActivity::class.java)

    @Test
    fun activityOpens() {
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun initIsCalled() {
        onView(withText("BUTTON")).check(matches(isDisplayed()))
    }

    @Test
    fun buttonPress() {
        onView(withText("BUTTON")).perform(click())
        onView(withText(buttonPress)).check(matches(isDisplayed()))
    }
}