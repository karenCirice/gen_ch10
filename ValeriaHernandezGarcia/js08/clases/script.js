console.log("J08 Estamos en sesión de clases, ese loko")

//El nombre de las clases debe comenzar en mayúsculas 
let nuevoArray = new Array(5); //Separa cada espacio y se puede agregar con una función 
let nuevoArray2 = [50] //Solo e sun espacio y para introducir más es manualmente
nuevoArray.push(20);
nuevoArray.pop();

class Persona{
    _nombre; //atributos de la clase
    _apellido; //_apellido para que los programadores no tenga acceso al atributo
    _edad;
    _arma;
    _banda;
    

    constructor(nombre, apellido, edad){ //el constructor inicializa los atributos de la clase
        this._nombre =  nombre; //this hace referencia a los atributos de la clase
        this._apellido = apellido; 
        this._edad = edad;
        this._arma = "piedra";
        
        
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nuevoNombre){ //con un set se tiene que establecer un parametro de entrada 
        this._nombre= nuevoNombre;

    }

     get arma(){
         return this._arma;

     }

     set arma(nuevaArma){
         this._arma = nuevaArma;
         this.valorDelArma(nuevaArma);
     }

     /**
      * @param {string} nuevaBanda
      */

     set bandaNueva(nuevaBanda){
        this._banda = nuevaBanda;
     }

     frase(frase){ //puedo ya estar definido = (frase = "vato loko")
         return `La vida es un riesgo carnal ${frase}`
     }

     /**
      * Verifica si la persona tiene un arma
      * @returns true si tiene arma
      */
    tieneArma(){
        if (this._arma == ""){
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
        if (this._arma !== ""){
            return "Este es de los mios";
        }
        else{
            return "Se queda viendo Bob Esponja";
        }
    }

   /**
    * Devuelve un texto indicando si es de los mios
    * @returns {string}
    */
    tieneGorra(){
        if (this._gorra !== ""){
            return "Este es de los mios";
        }
        else{
            return "No es de los mios";
        }
    }

    // el # hace que ya no se tenga acceso porque lo convierte en privado, se pone solo dentro de la clase y antes de declarar la función #valorDelArma 
    valorDelArma(tipoArma){
        if (tipoArma=="cuchillo"){
        this._apellido += " El cuchillos";
        }
    }
}

let persona1 = new Persona("El Dedotes", "Bardan", 50);
let persona2 = new Persona("El Billetes", "Rayas"); // new ers para instanciar una clase

//console.log(persona1);
//console.log(persona1);
console.log(persona1.nombre);
console.log("Nompre Persona 1:",persona1.nombre);
console.log("Nompre Persona 2:",persona2.nombre);
persona2.nombre = "El Centavos";
console.log("Nompre Persona 2:",persona2.nombre);
persona1.arma = "pica hielo";
persona2.arma = "cuchillo";
persona1.bandaNueva = 13;
persona2.bandaNueva = "Vatos Lokos";

//console.log("Datos Persona 1:",persona1);
//console.log("Datos Persona 2:",persona2);
//console.log("Frase P1", persona1.frase("hommie"));

/*if (persona1.tieneArma()){
    console.log("Puede ir al enfretamiento")
}
else{
    console.log("Se queda en su casa");
}*/

console.log("Mi cholo ", persona1.tieneArmaStr());

console.log("El cholo", persona1.tieneGorra());

persona1.arma = "piedra"
//persona1.valorDelArma("cuchillo");
console.log (persona1);

