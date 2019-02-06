package com.sg.flavorsample.extensions

import java.text.SimpleDateFormat
import java.util.*

fun String.convertStringToDate(simpleDateFormatPattern: String): Date? {
    val simpleDateFormat = SimpleDateFormat(simpleDateFormatPattern, Locale.getDefault())
    return simpleDateFormat.parse(this)
}
