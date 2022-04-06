console.log("js08 estamos en sesion de clases , ese loko");


console.log("J08 Estamos en sesion de clases, ese loko");

let nuevoArray = new Array(2, 3, 5, 6);
//convencion, atributos que no deben tocar los otros programadores, empieza con un _nombre.
// El nombre de las clases debe comenzar en mayusculas 

class PersonaChola {
    _nombre; //atributos de la clase
    _apellido;
    _edad;
    _arma;
    _banda;

    //constructor inicializa el objeto 
    constructor(nombre, apellido, edad) {
        this._nombre = nombre; //this hace referencia al objeto, el atributo nombre, lo igualamos al parametro de entrada del constructor
        this._apellido = apellido;// this hara referencia a los atributos de la clase
        this._edad = edad;
        this._arma = "";
        this._banda = "";
    }

    get nombre() {
        return this._nombre;
    }
    set nombre(nuevoNombre) {
        this._nombre = nuevoNombre;
    }
    get arma() {
        return this._arma;
    }
    set arma(nuevaArma) {
        this._arma = nuevaArma;
        this.valorArma(nuevaArma)

    }
    set banda(nuevaBanda) {
        this._banda = nuevaBanda;

    }


    frase(frase = "vato Loko") {
        return `La vida es un riesgo carnal ${frase}`
    }
    tieneArma() {

    }
    tieneArmaStr(tipoArma) {
        if (this._arma == "cuchillo") {
            return "Este es de los mios";
        } else {

        }
    }


}

let persona1 = new Persona("El Dedotes", "Bardan", 50);
let persona2 = new Persona("El Billetes", "Rayas");

//console.log(personaDedotes);
//console.log(personaBig);

console.log("Nombre personas 1:", persona1.nombre);
console.log("Nombre personas 2:", persona2.nombre);
persona2.nombre = "El Centavos: ";
console.log("Nombre Persona 2:", persona2.nombre);
persona1.arma = "pica hielo";
persona2.arma = "cuchillo";
persona1.banda = 13;
persona2.banda = "Vatos Lokos";



/*console.log("frase P1:", persona1.frase("rastacuas"));

if (persona1.tieneArma()) {
    console.log("Puede ir al enfrentamiento");
} else {
    console.log("Se queda en su chante");
}*/

//# al ponerlo en una funcion antes de declarar la funcion, lo proteje de que no se tenga acceso a la funcion fuera de la clase
persona1.arma = "piedra"
persona1.valorArma("cuchillo")
console.log(persona1);