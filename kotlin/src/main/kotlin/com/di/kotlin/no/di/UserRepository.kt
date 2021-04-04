package com.di.kotlin.no.di

import com.di.kotlin.model.User

class UserRepository {
    private val logger = Logger();

    fun findById(id: Long) : User {
        return User(id, "Carlos", "Perez")
    }

    fun createUser(nombre: String, apellido: String) : User{
        this.logger.log("user con nombre $nombre y apellido $apellido creado")
        return User(Math.random().toLong(), nombre, apellido)
    }
}