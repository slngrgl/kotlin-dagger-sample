package com.sg.kotlindaggersample.extensions

import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.EditText


/**
 * show validation error message
 */
fun EditText.afterTextChanged() {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {

        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            error = null
        }
    })
}
/**
 * end show validation error message
 */



/**
 * check validation by input
 */
fun String.isValidEmail(): Boolean = this.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
/**
 * end check validation
 */
