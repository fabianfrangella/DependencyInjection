package com.di.kotlin.no.di

import com.di.kotlin.IValidationsService

class ValidationsService : IValidationsService {
    val logger = Logger()
    override fun validateIdentidad(nombre: String?, apellido: String?): Boolean {
        logger.log("validando identidad de $nombre $apellido")
        return !nombre.isNullOrEmpty() && !apellido.isNullOrEmpty();
    }
}