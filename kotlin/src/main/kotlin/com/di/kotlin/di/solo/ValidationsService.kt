package com.di.kotlin.di.solo

class ValidationsService(private val logger: Logger) {
    fun validateIdentidad(nombre: String?, apellido: String?): Boolean {
        logger.log("validando identidad de $nombre $apellido")
        return !nombre.isNullOrEmpty() && !apellido.isNullOrEmpty();
    }
}