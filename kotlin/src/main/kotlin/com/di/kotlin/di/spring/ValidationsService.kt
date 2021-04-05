package com.di.kotlin.di.spring

import com.di.kotlin.IValidationsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ValidationsService : IValidationsService  {
    @Autowired
    private lateinit var logger: Logger

    override fun validateIdentidad(nombre: String?, apellido: String?): Boolean {
        logger.log("validando identidad de $nombre $apellido")
        return !nombre.isNullOrEmpty() && !apellido.isNullOrEmpty();
    }
}