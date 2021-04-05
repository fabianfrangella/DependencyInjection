package com.di.kotlin.no.di

import com.di.kotlin.model.User

class UserRepository {
    private val logger = Logger()

    private val users: MutableList<User> = mutableListOf()

    fun findById(id: Long) : User? {
        return users.find { it.id == id }
    }

    fun createUser(nombre: String, apellido: String) : User{
        this.logger.log("user con nombre $nombre y apellido $apellido creado")
        val user = User(Math.random().toLong(), nombre, apellido)
        users.add(user)
        return user
    }
}