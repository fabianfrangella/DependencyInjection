package com.di.kotlin.no.di

import com.di.kotlin.model.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller("/no-di")
class UserController {

    val userService = UserService()

    @PostMapping
    fun create(nombre: String, apellido: String): User {
        return this.userService.create(nombre, apellido)
    }

    @GetMapping
    fun findById(id: Long) : User? {
        return this.userService.findById(id)
    }
}