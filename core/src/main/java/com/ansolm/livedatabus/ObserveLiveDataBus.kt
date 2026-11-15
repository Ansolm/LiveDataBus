package com.ansolm.livedatabus

/**
 * author : Ansolm
 * e-mail : ansolm@outlook.com
 */
interface ObserveLiveDataBus<T> {
    fun observe(owner: T): ObserveLiveDataBus<T>

    fun removeAllObserver()
}