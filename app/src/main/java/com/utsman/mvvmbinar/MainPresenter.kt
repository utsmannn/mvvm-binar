package com.utsman.mvvmbinar

interface MainPresenter {
    fun plus()
    fun min()
}

class MainPresenterImpl(private val mainView: MainView) : MainPresenter {
    private var result: Int = 0

    override fun plus() {
        result += 1
        mainView.result(result)
    }

    override fun min() {
        result -= 1
        mainView.result(result)
    }
}