package com.example.kotlinjava

import android.widget.EditText

object Validations {
    fun validate(txt: EditText): Boolean = txt.text.startsWith("seguro", true)
}