package com.di.kotlin.di.spring

import com.di.kotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping

@Controller("/di-solo")
class UserController {

    @Autowired private lateinit var  userService: UserService

    @PostMapping()
    fun getById(nombre: String, apellido: String): User {
        return this.userService.create(nombre, apellido)
    }
}