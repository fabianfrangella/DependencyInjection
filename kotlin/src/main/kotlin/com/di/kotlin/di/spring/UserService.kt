package com.di.kotlin.di.spring

import com.di.kotlin.ILogger
import com.di.kotlin.IUserRepository
import com.di.kotlin.IUserService
import com.di.kotlin.IValidationsService
import com.di.kotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService : IUserService {

    @Autowired private lateinit var userRepository: IUserRepository
    @Autowired private lateinit var logger: ILogger
    @Autowired private lateinit var validationsService: IValidationsService

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