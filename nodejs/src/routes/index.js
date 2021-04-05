import {Container} from "../conDependencyInjection/conLibreria/Container";

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
const controller = Container.resolve("userController")
router.post("/awilix/create", (req,res,next) =>
    controller.create({req,res,next}))