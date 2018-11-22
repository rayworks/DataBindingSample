package com.rayworks.databindingsample

import android.databinding.BindingAdapter
import android.text.TextWatcher
import android.widget.EditText

object EditTextBindingAdapters {
    @BindingAdapter("app:textChangedListener")
    @JvmStatic
    fun bindTextWatcher(editText: EditText, textWatcher: TextWatcher) {
        editText.addTextChangedListener(textWatcher)
    }
}