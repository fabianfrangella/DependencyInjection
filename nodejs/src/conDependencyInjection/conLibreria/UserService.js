export class UserService {
    constructor(opts) {
        this.userRepository = opts.userRepository;
        this.logger = opts.logger;
        this.validationsService = opts.validationsService;
    }

    create(nombre, apellido) {
        const valid = this.validationsService.validateIdentidad(nombre, apellido);
        if (!valid) {
            throw Error("El nombre o el apellido no son validos");
        }
        const user = this.userRepository.create(nombre, apellido);
        this.logger.log(`User created: ${JSON.stringify(user,null,2)}`);
        return user
    }

    findById(id) {
        return this.userRepository.findById(id);
    }
}