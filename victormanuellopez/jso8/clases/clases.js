console.log("JS08 estamos en sesion de clases");

let nuevoArray = new Array(5);
let nuevoArry2 = [50];
nuevoArray.push(20);

// l nombre de las clases deben empezar en mayusculas
class Persona {
    //atributos de la clase.
    _nombre;
    _apellido;
    _edad;
    _arma;
    _banda;

    constructor(nombre, apellido, edad){
        // this hara referancia a los atributos de la clase.
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
        this._arma = "piedra";
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nuevoNombre){
        this._nombre = nuevoNombre;
    }

    get arma(){
        return this._arma;
    }

    set arma(nuevaArma){
        this._arma = nuevaArma;
        this.valordelArma(nuevaArma);
    }

    set banda(nuevaBanda){
        this._banda = nuevaBanda;
    }

    frase(frase = "Vato loko"){
        return `La vida es un riesgo carnal ${frase}`
    }
 
    tieneArma(){
        if (this._arma == ""){
            return false;
        }else {
            return true;
        }
    }

    tieneArmastr(){
        if (this._arma == ""){
            return "se queda en su house";
        }else{
            return "este es de los mios";
        }
    }

    valordelArma(tipoArma){
        if(tipoArma == "cuchillo"){
            this._apellido += " El cuchillos";
        }
    }
}

let persona1 = new Persona("el dedos", "bardan", 50);
let persona2 = new Persona("el billetes", "rayas");

console.log("Nombre Persona 1:", persona1.nombre);
console.log("Nombre Persona 2:", persona2.nombre);
persona2.nombre = "el centavos";
console.log("Nombre Persona 2:", persona2.nombre);
persona1.arma = "navaja";
persona2.arma = "cuchillo";
persona1.banda = "MS 13";
persona2.banda = "Vatos Locos";
//console.log("Datos persona 1", persona1);
//console.log("Datos persona 2", persona2);
//console.log("Frase p1: ", persona1.frase("rasta"));
/*if (persona1.tieneArma()){
    console.log("Jalate a al enfrentamiento");
}else{ 
    console.log("Quedate en tu chan");
}
*/
//console.log("Mi cholo: ", persona1.tieneArmastr());


persona1.arma = "cuchillo";
//persona1.valordelArma("cuchillo");
console.log(persona1);

/*
document.getElementById("per1").innerHTML = "Persona 1: " + persona1.nombre + " tiene una: ";
document.getElementById("per2").innerHTML = "Persona 2: " +persona2.nombre + " tiene un " + persona2.arma + 
    " es de la banda " + persona2.banda + persona2.tieneArma() + persona2.tieneArmastr();
*/

/*
class Cubos {
    //atributos de la clase.
    tipo;
    color;
    tamaño;
    peso;

    constructor(tipo, color){
        // this hara referancia a los atributos de la clase.
        this.tipo = tipo;
        this.color = color;
        this.tamaño = "mediano";
    }

    get tipocubo(){
        return this.tipo;
    }
}

let cubof = new Cubos("Fuego", "rojo");
let cuboA = new Cubos();

console.log(cubof.tipocubo);
console.log(cuboA.tipocubo);
*/