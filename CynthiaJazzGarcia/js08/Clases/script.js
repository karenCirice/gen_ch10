console.log("js08 Estamos en la sesion de clases");

let nuevoArray = new Array (50); //cuando esta como necesitas 50 espacios (50)
let nuevoArray2 = [50]; //cuando se ponen []
nuevoArray2.push(20);
nuevoArray.pop();
//la clase es la sustancia quimica y el constructor es el catalizador que inicia la reacción

//el nombre de las clases deve comenzar en mayusculas
class Persona{ //esta es mi clase
    _nombre; //este es un atributo de mi clase
    _apellido; //este es un atributo de mi clase
    _edad; //este es un atributo de mi clase
    _arma;
    _banda;
//el constructor lo usamos para inicializar una clase
constructor(nombre, apellido, edad){ //estos son paramentros para dar de alta mi objeto, pueden ir o no el constructor tiene la tarea de inicializar los atributos de la clase
    this._nombre = nombre;//para hacer referencia a nombre del objeto se usa this.// se pone = a nombre del constructor
    this._apellido =apellido;
    this._edad = edad;
    this._arma = "piedra";
}

    get nombre(){ ///get=obtener datos
        return this._nombre;
    }

    set nombre (nuevoNombre){ //metodo
        this._nombre = nuevoNombre;
    }

    get arma(){
        return this._arma;
    }

    set arma (nuevaArma){
        this._arma = nuevaArma;
        this.#valorDelArma(nuevaArma);
    }

 /**
 * @param {string} nuevaBanda Banda a la que pertenece
 */
    set banda(nuevaBanda){
        this._banda = nuevaBanda;
    }

    frase(frase = "vato loko"){ //este es un metodo
        return `la vida es un riesgo carnal ${frase}`
    }

/**
 * Verifica si tiene un arma
 * @returns true si tiene un arma
 */
    tieneArma(){
        if(this._arma == ""){
            return false;
        }
        else {
         return true;
    }
    }

/**
 * Devuelve un texto para ver si el cholo puede participar
 */
    tieneArmaStr(){
        if (this._arma != ""){
            return "Este es de los mios";
        }
        else{
            return "se queda viendo bob esponja";
        }
    }

    #valorDelArma(tipoArma){//funcion con entrada //se pone gato para que nadie modifique esta funcion
        if (tipoArma =="cuchillo"){
            this._apellido += " El Cuchillos"
        }
    }

}

let persona1= new Persona("El Dedotes", "Bardan", 50);
let persona2 = new Persona("El billetes", "Rayas");

//console.log(persona1);
//console.log(persona2)
console.log("Nombre Persona 1:",persona1.nombre);
console.log("Nombre Persona 2:",persona2.nombre);
persona2.nombre = "El Centavos";
console.log("Nombre Persona 2", persona2.nombre);
persona1.arma = "manopla";
persona2.arma ="cuchilo";
persona1.banda = 13;
persona2.banda = "lokos";
//console.log("Datos persona 1:", persona1);
//console.log("Datos persona 1:", persona1);
//console.log("Frase p1", persona1.frase("rastacuas"));

if (persona1.tieneArma()){
    console.log ("Puede ir al combate");
}
else{
    console.log ("se queda en su casa")
}

persona1.arma = "piedra" //el set de arma es el que cambia  el valor del arma
//persona1.#valorDelArma("cuchillo"); //no esta cambiando  el tipo de arma 
console.log(persona1);
