package com.di.kotlin.di.solo

import com.di.kotlin.model.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller("/di-solo")
class UserController {

    private final val logger = Logger()
    private val userService = UserService(
            UserRepository(logger),
            logger,
            ValidationsService(logger))

    @PostMapping()
    fun create(nombre: String, apellido: String): User {
        return this.userService.create(nombre, apellido)
    }

    @GetMapping
    fun findById(id: Long) : User? {
        return this.userService.findById(id)
    }
}