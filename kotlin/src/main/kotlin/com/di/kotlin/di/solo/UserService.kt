package com.di.kotlin.di.solo

import com.di.kotlin.model.User

class UserService(private val userRepository: UserRepository, private val logger: Logger, private val validationsService: ValidationsService) {

    fun create(nombre: String, apellido: String): User {
        val valid = this.validationsService.validateIdentidad(nombre, apellido)
        if (!valid) {
            throw Exception("El nombre o el apellido no son validos")
        }
        val user = this.userRepository.createUser(nombre, apellido)
        this.logger.log("User created: $user")
        return user
    }

    fun findById(id: Long) : User? {
        return this.userRepository.findById(id)
    }
}