package com.example.currencyconverterapp

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("onFocus")
fun setOnClick(view: View, onFocus: View.OnFocusChangeListener?) {
    view.onFocusChangeListener = onFocus
}