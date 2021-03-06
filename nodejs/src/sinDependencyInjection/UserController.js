import {UserService} from "./UserService";

export class UserControllerSinDI {

    userService = new UserService();


    create(ctx) {
        const {nombre, apellido} = ctx.req.query;
        const user = this.userService.create(nombre, apellido);
        ctx.res.json(user);
    }

    findById(ctx) {
        const {id} = ctx.req.query;
        const user = this.userService.findById(id)
        ctx.res.json(user);
    }
}