package com.di.kotlin

import com.di.kotlin.model.User

interface IUserRepository {

    fun findById(id: Long) : User?

    fun createUser(nombre: String, apellido: String) : User
}