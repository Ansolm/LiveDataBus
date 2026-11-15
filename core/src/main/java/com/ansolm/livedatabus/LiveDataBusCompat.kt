package com.ansolm.livedatabus

/**
 * author : Ansolm
 * e-mail : ansolm@outlook.com
 */
fun runOnBackgroundThread(callback: (() -> Unit)) {
    LiveDataBus.Holder.BUS.handler.post { callback.invoke() }
}