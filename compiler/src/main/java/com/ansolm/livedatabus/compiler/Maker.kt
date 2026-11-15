package com.ansolm.livedatabus.compiler

import javax.annotation.processing.Filer

/**
 * author : Ansolm
 * e-mail : ansolm@outlook.com
 */
interface Maker {
    companion object {
        const val TAB = "    "
    }

    val `package`: String
    val packageGenerator: String
    val className: String
    val classNameGenerator: String

    fun make(filer: Filer)
}