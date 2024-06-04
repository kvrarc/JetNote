package com.handsomeware.jetnote.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun formatDate(time: Long): String {
    val date = Date(time)
    val formatter = SimpleDateFormat("EEE, d MMM hh:mm aaa", Locale.getDefault())
    val formattedDate = formatter.format(date)
    return formattedDate.replace("am", "AM").replace("pm", "PM")
}