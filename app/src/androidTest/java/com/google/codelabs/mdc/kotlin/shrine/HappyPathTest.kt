package com.google.codelabs.mdc.kotlin.shrine

import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.google.codelabs.mdc.kotlin.shrine.screen.Item
import com.google.codelabs.mdc.kotlin.shrine.screen.LoginScreen
import com.google.codelabs.mdc.kotlin.shrine.screen.MainScreen
import org.junit.Rule
import org.junit.Test

class HappyPathTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> =
            ActivityTestRule(MainActivity::class.java)

    @Test
    fun happyPath() {
        onScreen<LoginScreen> {
            username.scrollTo()
            username.typeText("admin")

            password.scrollTo()
            password.typeText("password")

            nextButton.scrollTo()
            nextButton.click()
        }

//        onScreen<MainScreen> {
//            toolbar.isDisplayed()
//            shoppingList {
//                hasSize(38)
//                childAt<Item>(0) {
//                    title.hasText("Vagabond sackx")
//                    price.hasText("$120")
//                    image.isDisplayed()
//                }
//                scrollToEnd()
//                swipeRight()
//                swipeLeft()
//            }
////            items[0] {
////                isDisplayed()
////                hasDrawable(0)
////            }
//        }
    }
}
