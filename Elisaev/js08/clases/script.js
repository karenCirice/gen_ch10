console.log("Clase Programacion Orientada a objetos (POO)");

// las clases no tienen hosting: no pueden ser usadas si no estan declaradas antes

// Las clases comienzan con la primer letra en mayuscula.

let nuevoArray = new Array(50); // es igual a  nuevoArray = [50];
 
//la clases es el molde generico que almacena un objeto,dentro de la clase contiene los atributos y metodos del objeto.
class Persona {
    // no es necesario declararlas
    _nombre; // se utliza _ para que otro desarrollador no pueda acceder a ella.
    _apellido;
    _edad;
    _arma;
    /**
     * se utliza para inicializar los atributos de la clase.
     */
    constructor(nombre, apellido, edad, arma){
        this._nombre = nombre; // this hace referencia al atributo dentro de la clase.
        this._apellido = apellido;
        this._edad = edad;
        this._arma = "Cullillo";
    } 

    // get: obtiene la propiedad de un objeto
    /**
     * Accede al nombre del objeto
     */
    get personaNombre() {
        return this._nombre;
    }


    //set: establece el valor de la propiedad
    /**
     * establece un nuevoNombre(valor) a la propiedad nombre.
     */
    set personaNombre(nuevoNombre){
        this._nombre = nuevoNombre;
    }

    get personaEdad(){
        return this._edad; 

    }

    set personaEdad(nuevaEdad){
        this._edad = nuevaEdad;
    }

    /** 
     * @param {string} nuevaArma Cambio de arma en personaArma
     * Evalua la nuevaArma en la funcion valorDelArma
     */
    set personaArma(nuevaArma) {
        this._arma = nuevaArma;
        this.valorDelArma(nuevaArma);
    }
    //metodo (acccion del objeto)
    /**
     * 
     * @param {*} frase 
     * @returns Regresa frase de guerra
     */
    frase(frase = "amigo") {
        //
        return `El que tenga miedo a morir, que no nazca ${frase}`
    }

    /**
     * 
     * @returns verifica si la persona tiene un arma (string). 
     */
    tieneArma() {
        if (this._arma == "") {
            return false;
        }
        else {
            return true;
        }
    }


    tieneArmaStr() {
        if (this._arma != "") {
            return "Este es de mi clika";
        }
        else{
            return "Se queda viendo los teletubies"
        }
    }

/**
 * 
 * @param {*} tipoArma  evalual el tipo de arma, y si es tijeras se concatena al apellido establecido.
 */
    valorDelArma(tipoArma){
        if (tipoArma == "tijeras");
        this._apellido += " El tijeras";

    }
} 

// instanciar una clase.
let persona1 = new Persona("Elisa","Espinoza", 25); //Agrega datos a la clase.
let persona2 = new Persona("Juan","Perez");
// console.log(persona1);
// console.log(persona2);

//* Se debe de especificar la varieble a la que se le va asignar los atributos (persona1 o persona2)
console.log("Nombre Persona1: ",persona1.personaNombre); //regresa la propiedad de un objeto.

persona2.personaNombre = "Maria"; // cambio el valor de la propiedad 
console.log("Nombre Persona2: ", persona2.personaNombre);


persona2.nuevaEdad = 28;
console.log("Edad persona2: ", persona2.nuevaEdad);


// regresa la nueva frase del metodo (frase)
console.log("Frase persona1: ", persona1.frase("y nimodo"));


// condiciona si puede o no ir , deacuerdo al boleano de tieneArma()
if (persona1.tieneArma()) {
    console.log("Puede ir al enfrentamiento");

}
else {
    console.log("se queda en su canton");

}

console.log("Mi cholo", persona1.tieneArmaStr());

// 

persona1.personaArma = "piedra";
// persona1.#valorDelArma("tijeras")  //# protege la funcion, solo se puede utilizar dentro de la clase
console.log(persona1);