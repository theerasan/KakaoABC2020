package com.google.codelabs.mdc.kotlin.shrine

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.google.codelabs.mdc.kotlin.shrine.screen.Item
import com.google.codelabs.mdc.kotlin.shrine.screen.LoginScreen
import com.google.codelabs.mdc.kotlin.shrine.screen.MainScreen
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test

class HappyPathWithEspressoTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> =
            ActivityTestRule(MainActivity::class.java)

    @Test
    fun happyPath() {
        onView(allOf(withId(R.id.username_edit_text)))
                .perform(scrollTo(), typeText("admin"))

        onView(allOf(withId(R.id.password_edit_text)))
                .perform(scrollTo(), typeText("password"))

        onView(allOf(withId(R.id.next_button)))
                .perform(scrollTo(), click())

    }
}
