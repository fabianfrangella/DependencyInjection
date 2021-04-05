package com.di.kotlin.di.solo

import com.di.kotlin.ILogger

class Logger : ILogger {

    override fun log(message: String) {
        println(message)
    }
}