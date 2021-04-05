import awilix from 'awilix'
import {UserRepository} from "./UserRepository";
import {Logger} from "./Logger";
import {UserService} from "./UserService";
import {UserController} from "./UserController";
import {ValidationsService} from "./ValidationsService";

const container = awilix.createContainer()

container.register({
    userRepository: awilix.asClass(UserRepository),
    logger: awilix.asClass(Logger),
    userService: awilix.asClass(UserService),
    userController: awilix.asClass(UserController),
    validationsService: awilix.asClass(ValidationsService)
})