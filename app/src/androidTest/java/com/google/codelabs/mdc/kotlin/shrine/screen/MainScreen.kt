package com.google.codelabs.mdc.kotlin.shrine.screen

import android.view.View
import com.agoda.kakao.image.KImageView
import com.agoda.kakao.recycler.KRecyclerItem
import com.agoda.kakao.recycler.KRecyclerView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.agoda.kakao.toolbar.KToolbar
import com.google.codelabs.mdc.kotlin.shrine.R
import com.google.codelabs.mdc.kotlin.shrine.view.ViewFinder.customCartView
import org.hamcrest.Matcher

class MainScreen : Screen<MainScreen>() {
    val toolbar = KToolbar { withId(R.id.app_bar) }
    val shoppingList = KRecyclerView(
            { withId(R.id.recycler_view) },
            { itemType(::Item) }
    )

    val items = customCartView(R.id.cart)
}

class Item(parent: Matcher<View>) : KRecyclerItem<Item>(parent) {
    val title = KTextView(parent) { withId(R.id.product_title) }
    val price = KTextView(parent) { withId(R.id.product_price) }
    val image = KImageView(parent) { withId(R.id.product_image) }
}
