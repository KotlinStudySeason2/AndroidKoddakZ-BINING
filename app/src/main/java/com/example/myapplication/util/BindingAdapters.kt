package com.example.myapplication.util

import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("app:createDate")
fun bindCreateDate(textView: TextView, date: Date?) {
    val dateFormat = SimpleDateFormat("yyyy.MM.dd", Locale.KOREA)
    val createDateString = dateFormat.format(date ?: return)
    textView.text = createDateString
}