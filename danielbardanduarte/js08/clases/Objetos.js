console.log("J08 Estamos en clases");

let nuevoArray = new Array(5);
let nuevoArray2 = [50]; //Es lo mismo la linea 3 y 4
nuevoArray.pop(20);
//El nombre de las clases debe comenzar en mayusculas
class Persona{
    _nombre; //atributos de las clases
    _apellido;
    _edad;
    _arma;
    _banda;

    constructor(nombre, apellido, edad){ //Es la base donde se contruyen las cosas
        this._nombre = nombre; // Se utiliza el this para especificar que es el nombre del primer class
        this._apellido = apellido; 
        this._edad = edad;
        this._arma = "piedra"; 

      //Solos los SET llevan parametros, los get NO
    }
    get nombre (){
        return this._nombre;
    }
    set nombre(nuevoNombre){
        this._nombre = nuevoNombre;
    }

    get arma(){
        return this._arma;
    }
    set arma(nuevaArma){
        this._arma= nuevaArma;
    }
    set banda(nuevaBanda){
        this._banda = nuevaBanda;
    }
    frase(frase){
        return `La vida es un riego carnal ${frase}`
    }

}
let personaDedotes = new Persona("El Dedotes", "Bardan" , 25);
let persona2 = new Persona ("El bileltes", "Rayas");


console.log(personaDedotes);
console.log("Nombre persona 2:" ,persona2.nombre);
persona2.nombre = "El centavos";
console.log("Nombre Persona 2:" , persona2.nombre);
personaDedotes.arma = "Boxer";
persona2.arma = "Filero";

personaDedotes.banda = "MS 13(base10)"
persona2.banda = "Vatos lokos";
console.log("Datos personaDedotes:" , personaDedotes);
console.log("Datos persona2:" , persona2);
console.log("Frase Dedotes" , personaDedotes.frase("hommie"));
