package com.di.kotlin.di.spring

import com.di.kotlin.ILogger
import org.springframework.stereotype.Component

@Component
class Logger : ILogger {

    override fun log(message: String) {
        println(message)
    }
}