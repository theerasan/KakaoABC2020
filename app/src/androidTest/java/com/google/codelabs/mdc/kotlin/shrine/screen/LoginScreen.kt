package com.google.codelabs.mdc.kotlin.shrine.screen

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.google.codelabs.mdc.kotlin.shrine.R

class LoginScreen : Screen<LoginScreen>() {
    val username = KEditText { withId(R.id.username_edit_text) }
    val password = KEditText { withId(R.id.password_edit_text) }
    val cancelButton = KButton { withId(R.id.cancel_button)}
    val nextButton = KButton { withId(R.id.next_button)}
}
