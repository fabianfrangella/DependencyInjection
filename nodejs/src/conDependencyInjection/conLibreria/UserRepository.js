import {User} from "./User";

export class UserRepository {
    users = []

    constructor(opts) {
        this.logger = opts.logger
    }

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