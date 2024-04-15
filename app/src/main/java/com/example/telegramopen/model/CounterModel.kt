package com.example.telegramopen.model

class CounterModel {
    private var counter = 0

    fun incrementCounter() {
        counter++
    }

    fun decrementCounter() {
        counter--
    }

    fun getCounter() = counter
}

