package com.ansolm.livedatabus

import androidx.lifecycle.LifecycleOwner
import com.ansolm.livedatabus.ObservableWrapper
import androidx.lifecycle.MutableBusLiveData
import androidx.lifecycle.Observer
/**
 * author : Ansolm
 * e-mail : ansolm@outlook.com
 */
interface Observable<T> {
    fun observe(owner: LifecycleOwner, observer: Observer<in T>)
    fun observeSticky(owner: LifecycleOwner, observer: Observer<in T>)
    fun observeForever(observer: Observer<in T>)
    fun observeForeverSticky(observer: Observer<in T>)
    fun removeObserver(observer: Observer<in T>)
}