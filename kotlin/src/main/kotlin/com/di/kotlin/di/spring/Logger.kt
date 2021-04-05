package com.di.kotlin.di.spring

import org.springframework.stereotype.Component

@Component
class Logger {

    fun log(message: String) {
        println(message)
    }
}