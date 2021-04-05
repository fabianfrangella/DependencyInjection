export class ValidationsService {
    validateIdentidad(nombre, apellido) {
        return nombre && apellido
    }
}