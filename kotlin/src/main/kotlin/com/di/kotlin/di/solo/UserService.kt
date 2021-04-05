package com.di.kotlin.di.solo

import com.di.kotlin.ILogger
import com.di.kotlin.IUserRepository
import com.di.kotlin.IUserService
import com.di.kotlin.IValidationsService
import com.di.kotlin.model.User

class UserService(private val userRepository: IUserRepository,
                  private val logger: ILogger,
                  private val validationsService: IValidationsService) : IUserService {

    override fun create(nombre: String, apellido: String): User {
        val valid = this.validationsService.validateIdentidad(nombre, apellido)
        if (!valid) {
            throw Exception("El nombre o el apellido no son validos")
        }
        val user = this.userRepository.createUser(nombre, apellido)
        this.logger.log("User created: $user")
        return user
    }

    override fun findById(id: Long) : User? {
        return this.userRepository.findById(id)
    }
}