/*console.log("Estoy en JS08, yea, yea, la muñeca fea");

let persona = {
    nombre: "Cholisa",
    apellido: "Greñas",
    edad: 24,
    nombreCompleto: function (){
        return `${this.nombre} ${this.apellido} *** `;
    },
    get nombreEdad(){
        return `${this.nombre} tiene ${this.edad}`;
    }
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`;
    }
    set cambiarNombre(nombre){
        this.nombre = nombre;
    }
};

console.log(persona.nombre);
console.log (persona["nombre"]);

persona.nombre = "Cholafne";

console.log (persona["nombre"]);

console.log(persona.nombreCompleto());*/

console.log("JS08 estamos en sesión de clases, ese loko");

let newArray = new Array(5);
//El nombre de las clases debe comenzar en mayúsculas
class Persona {
    _nombre;
    _apellido;
    _edad;
    _arma;
    _banda;

    constructor(nombre, apellido, edad) {
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
        this.arma = "piedra";
    }

    get nombre() {
        return this._nombre;
    }

    get arma() {
        return this._arma;
    }

    set arma(nuevaArma) {
        this._arma = nuevaArma;
    }

    set nombre(nuevoNombre) {
        this._nombre = nuevoNombre;
    }

    set bandaNueva(nuevaBanda) {
        this._banda = nuevaBanda;
    }

    frase(frase = "vato loko") {
        return `La vida es un riesgo carnal ${frase}`
    }

    tieneArmaStr() {
        if (this._arma != "") {
            return "Este es de los míos";
        } 
        else{
            return "Se queda viendo Bob Esponja";
        }
    }

    valorDelArma(tipoArma){
        if (tipoArma="cuchillo"){
          this._apellido = this._apellido + " El cuchillos";  
        }
    }
}


let persona1 = new Persona("El Dedotes", "Bardan", 50, 
"cuchillo");
let persona2 = new Persona("El Billetes", "Rayas");

console.log("Nombre Persona 1", persona1.nombre);
console.log("Nombre Persona 2", persona2.nombre);


if (persona1.tieneArmaStr()){
    console.log("Puede ir al enfrentamiento");

}


