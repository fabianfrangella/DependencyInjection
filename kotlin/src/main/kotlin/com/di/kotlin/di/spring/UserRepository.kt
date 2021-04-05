package com.di.kotlin.di.spring

import com.di.kotlin.ILogger
import com.di.kotlin.IUserRepository
import com.di.kotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserRepository : IUserRepository {

    @Autowired private lateinit var logger: ILogger

    private val users: MutableList<User> = mutableListOf();

    override fun findById(id: Long) : User? {
        return users.find { it.id == id }
    }

    override fun createUser(nombre: String, apellido: String) : User{
        this.logger.log("user con nombre $nombre y apellido $apellido creado")
        val user = User(Math.random().toLong(), nombre, apellido)
        users.add(user)
        return user
    }

}