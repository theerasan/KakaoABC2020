package com.google.codelabs.mdc.kotlin.shrine.view

import com.agoda.kakao.image.KImageView

object ViewFinder {

    fun customCartView(id: Int) = listOf(
            KImageView {
                withTag("customCartView1")
                isDescendantOfA { withId(id) }
            },
            KImageView {
                withTag("customCartView2")
                isDescendantOfA { withId(id) }
            },
            KImageView {
                withTag("customCartView3")
                isDescendantOfA { withId(id) }
            },
            KImageView {
                withTag("customCartView4")
                isDescendantOfA { withId(id) }
            },
            KImageView {
                withTag("customCartView5")
                isDescendantOfA { withId(id) }
            }
    )
}
