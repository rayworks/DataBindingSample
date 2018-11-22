package com.rayworks.databindingsample.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.text.Editable
import android.text.TextWatcher
import com.rayworks.databindingsample.BR

class PasswordViewModel : BaseObservable() {
    var password: String = ""
        @Bindable
        get() {
            return field
        }
        set(value) {
            if (value != field) {
                field = value

                notifyPropertyChanged(BR.password)
                notifyPropertyChanged(BR.passwordQuality)
            }
        }

    @Bindable
    fun getPasswordQuality(): String = when (password) {
        "" -> "Enter a password"
        "admin", "password" -> "Very bad"
        else -> if (password.length < 6)
            "Short" else "OKay"
    }

    @Bindable
    fun getPasswordTextWatcher(): TextWatcher {
        return object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                password = s.toString()
            }

            override fun afterTextChanged(s: Editable) {
                // Do nothing.
            }
        }
    }
}