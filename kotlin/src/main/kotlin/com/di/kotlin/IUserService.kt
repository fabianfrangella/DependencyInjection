package com.di.kotlin

import com.di.kotlin.model.User

interface IUserService {

    fun create(nombre: String, apellido: String): User

    fun findById(id: Long) : User?
}