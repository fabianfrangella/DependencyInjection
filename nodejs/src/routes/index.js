import {Container} from "../conDependencyInjection/conLibreria/Container";
import {UserController} from "../conDependencyInjection/conLibreria/UserController";
import {UserService} from "../conDependencyInjection/conLibreria/UserService";
import {UserRepository} from "../conDependencyInjection/conLibreria/UserRepository";
import {Logger} from "../conDependencyInjection/conLibreria/Logger";
import {ValidationsService} from "../conDependencyInjection/conLibreria/ValidationsService";
import {UserControllerSinDI} from "../sinDependencyInjection/UserController";

var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

module.exports = router;


/**
 * Con Awilix
 */
const controller1 = Container.resolve("userController")
router.post("/di/awilix/create", (req,res,next) =>
    controller1.create({req,res,next}))

/**
 * Sin awilix pero con inyección
 */
const logger = new Logger();
const validationsService = new ValidationsService();
const userRepository = new UserRepository({logger});
const userService = new UserService({logger, userRepository, validationsService});
const controller2 = new UserController({userService});

router.post("/di/create", (req,res,next) =>
    controller2.create({req,res,next}))

/**
 * Sin dependency injection
 */
const controller3 = new UserControllerSinDI();
router.post("/no-di/create", (req,res,next) =>
    controller3.create({req,res,next}))