package com.di.kotlin

interface IValidationsService {
    fun validateIdentidad(nombre: String?, apellido: String?): Boolean
}