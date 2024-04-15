package com.example.telegramopen.view

import com.example.telegramopen.model.CounterModel

class Presenter(private var view: CounterView) {

    private var model = CounterModel()

    fun incrementCounter() {
        model.incrementCounter()
        view.showNewCount(model.getCounter())

        if (model.getCounter() == 10){
            view.showToast("Поздравляем")
        }
        else if (model.getCounter() == 15){
            view.changeColor()
        }
    }

    fun decrementCounter() {
        model.decrementCounter()
        view.showNewCount(model.getCounter())
    }
}