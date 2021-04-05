import {User} from "./User";
import {Logger} from "./Logger";

export class UserRepository {
    users = []
    logger = new Logger()

    create(nombre, apellido) {
        const user = new User(Math.random(), nombre, apellido)
        this.users.push(user);
        this.logger.log(`user con nombre ${nombre} y apellido ${apellido} creado`)
        return user
    }

    findById(id) {
        return this.users.find(user => user.id === id)
    }
}