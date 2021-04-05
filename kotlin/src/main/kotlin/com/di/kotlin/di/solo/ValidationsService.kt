package com.di.kotlin.di.solo

import com.di.kotlin.ILogger
import com.di.kotlin.IValidationsService

class ValidationsService(private val logger: ILogger) : IValidationsService {
    override fun validateIdentidad(nombre: String?, apellido: String?): Boolean {
        logger.log("validando identidad de $nombre $apellido")
        return !nombre.isNullOrEmpty() && !apellido.isNullOrEmpty();
    }
}