package com.simpleapps.symmetricalsniffle.activities

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ImplBaseActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(ImplBaseActivity::class.java)

    @Test
    fun activityOpens(){
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }
}