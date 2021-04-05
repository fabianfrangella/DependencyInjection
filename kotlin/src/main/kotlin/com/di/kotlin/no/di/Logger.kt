package com.di.kotlin.no.di

import com.di.kotlin.ILogger

class Logger : ILogger {

    override fun log(message: String) {
        println(message)
    }
}