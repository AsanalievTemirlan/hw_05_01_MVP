package com.example.telegramopen.view

interface CounterView {
    fun showNewCount(number: Int)
    fun showToast(context: String)
    fun changeColor()
}