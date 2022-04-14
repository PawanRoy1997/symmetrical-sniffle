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
internal class ImplAdActivityTest{
    val adsTest = "Ad Is Check"
    val buttonText = "Button Is Pressed"

    @get:Rule
    val activityRule = ActivityScenarioRule(ImplAdActivity::class.java)

    @Test
    fun activityOpens(){
        onView(withText(adsTest)).check(matches(isDisplayed()))
    }

    @Test
    fun buttonIsDisplayed(){
        onView(withText("BUTTON")).check(matches(isDisplayed()))
    }

    @Test
    fun buttonListenerIsSet(){
        onView(withText("BUTTON")).perform(click())
        onView(withText(buttonText)).check(matches(isDisplayed()))
    }
}