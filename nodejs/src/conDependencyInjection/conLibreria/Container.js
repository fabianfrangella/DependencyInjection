const awilix = require('awilix')
import {UserRepository} from "./UserRepository";
import {Logger} from "./Logger";
import {UserService} from "./UserService";
import {UserController} from "./UserController";
import {ValidationsService} from "./ValidationsService";

export const Container = awilix.createContainer()

Container.register({
    userRepository: awilix.asClass(UserRepository),
    logger: awilix.asClass(Logger),
    userService: awilix.asClass(UserService),
    userController: awilix.asClass(UserController),
    validationsService: awilix.asClass(ValidationsService)
});