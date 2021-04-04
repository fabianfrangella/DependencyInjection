package com.di.kotlin.no.di

import com.di.kotlin.model.User

class UserService {
    private val userRepository = UserRepository()
    private val validationsService = ValidationsService()
    private val logger = Logger()

    fun create(nombre: String, apellido: String): User {
        val valid = this.validationsService.validateIdentidad(nombre, apellido)
        if (!valid) {
            throw Exception("El nombre o el apellido no son validos")
        }
        val user = this.userRepository.createUser(nombre, apellido)
        this.logger.log("User created: $user")
        return user
    }
}