console.log("JS08 Sesion de clases POO");

class Persona{
    _nombre;
    apellido;
    edad;

    constructor(nombre,apellido,edad){
        this._nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    getInfo(){
        return `
            NOMBRE:\t\t${this._nombre}
            APELLIDO:\t${this.apellido}
            EDAD:\t\t${this.edad}
        `
    }

    get nombre(){
        return this._nombre;
    }

    get apellido(){
        return this.apellido;
    }

    get edad(){
        return this.edad;
    }

}

let persona1 = new Persona("Ernesto","Aldana",24);
console.log(persona1.getInfo());
console.log(persona1.nombre);