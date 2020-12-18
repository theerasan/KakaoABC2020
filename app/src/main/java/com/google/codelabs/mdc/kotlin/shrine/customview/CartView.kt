package com.google.codelabs.mdc.kotlin.shrine.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.google.codelabs.mdc.kotlin.shrine.R

class CartView @JvmOverloads constructor(
        context: Context,
        attributeSet: AttributeSet? = null,
        defStyleAttr: Int = 0
) : RelativeLayout(context, attributeSet, defStyleAttr) {

    init {
        View.inflate(getContext(), R.layout.shr_cart_layout, this)
    }
}
