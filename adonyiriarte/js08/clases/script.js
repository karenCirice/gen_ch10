//console.log("js08 Clases, en programación orientada a objetos.");

let nuevoArray = new Array(5);
let nuevoArray2 = [50] ;
nuevoArray.push(20);
nuevoArray.pop();


//El nombre de las clases debe comenzar en mayúsculas
class Persona{
    /*_nombre; //atributos de la clases
    _apellido;
    _edad;
    _arma;
    _banda; */

    constructor(nombre, apellido, edad){
        this.nombre = nombre; //this hará referencia a los atributos de la clases
        this._apellido = apellido;
        this._edad = edad;
        this._arma = "piedra";
    }

    get nombre(){
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
        this.#valorDelArma(nuevaArma);
    }

    /**
     * @param {string} nuevaBanda Banda a la que pertenece
     */
    set banda(nuevaBanda){
        this._banda = nuevaBanda;
    }

    frase(frase = "vato loko"){
        return `La vida es un riesgo carnal ${frase}`
    }
    
    /**
     * Verifica si la persona tiene un arma
     * @returns true si tiene arma
     */
    tieneArma(){
        if (this._arma == "" ){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Devuelve un texto indicando si mi cholo puede participar
     * @returns {string} frase de guerra
     */
    tieneArmaStr(){
        if (this._arma != "" ){
            return "Este es de los mios";
        }
        else{
            return "Se queda viendo Bobo Esponja"
        }
    }

    #valorDelArma(tipoArma){
        if (tipoArma=="cuchillo"){
            this._apellido = this._apellido + " El Chuchillos";
        }
    }
   
}

let persona1 = new Persona("El Dedotes", "Bardan", 50 );
let persona2 = new Persona("El Billetes", "Rayas");

//console.log(persona1);
//console.log(persona2);
console.log("Nombre Persona 1:",persona1.nombre);
console.log("Nombre Persona 2:",persona2.nombre);
persona2.nombre = "El Centavos";
console.log("Nombre Persona 2:",persona2.nombre);
persona1.arma = "pica hielo";
persona2.arma = "cuchillo";
persona1.banda = 13;
persona2.banda = "Vatos Lokos";
//console.log("Datos Persona 1:",persona1);
//console.log("Datos Persona 2:",persona2);
//console.log("Frase P1: ", persona1.frase("rastacuas"));

/* if (persona1.tieneArma()){
    console.log("Puede ir al enfrentamiento");    
}
else{
    console.log ("Se queda en su casa");
} */

persona1.arma = "piedra"
//persona1.#valorDelArma("cuchillo");

 persona1.nombrE = "Alberto";
 console.log (persona1);