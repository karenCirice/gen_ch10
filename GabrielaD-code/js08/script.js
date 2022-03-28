console.log("Js08 Estamos en sesión de clases, ese loko");

let nuevoArray = new Array(50);
let nuevoArray2 = [50];
nuevoArray.pop(20);

//El nombre de las clases debe comenzar en mayúsculas
class Persona{
    _nombre;
    _apellido;
    _edad;
    _arma;
    _banda;

    constructor(nombre, apellido, edad){
        this._nombre=nombre;
        this._apellido=apellido;
        this._edad=edad;
        this._arma="piedra";
    }

    get nombre(){return this._nombre;}
    set nombre(nuevoNombre){this._nombre=nuevoNombre;}

    get arma(){return this._arma;}
    set arma(nuevaArma){
        this._arma = nuevaArma;
        this.#valorDelArma(nuevaArma);
    }

    set banda(nuevaBanda){this._banda = nuevaBanda;}

    frase(frase=" vato Loko"){return `La vida es un riesgo carnal ${frase}`;}

    tieneArma(){
        if(this._arma ==""){return false;}
        else{return false;}
    }

    tieneArmaStr(){
        if(this._arma !=""){return "Es de los mios ";}
        else{return "Mejor ve Bob Esponja";}
    }

    #valorDelArma(tipoArma){
        if(tipoArma == "cuchillo"){this._apellido+= " El cuchillos";}
    }

    
}

let persona1 = new Persona("El dedotes","Bardan",50);
let persona2 = new Persona("El diablo","Rayas");

console.log("Nombre Persona 1: ",persona1.nombre);
console.log("Nombre Persona 2: ",persona2.nombre);

persona2.nombre = "El centavos";

console.log("Nombre persona 2: ",persona2.nombre);

persona1.arma = "pica hielo";
persona2.arma = "cuchillo";

persona1.banda = 13;
persona2.banda = "Vatos Lokos";


// console.log("Datos Persona 1: ", persona1);
// console.log("Datos Persona 2: ",persona2);

// console.log("Frase P1: ", persona1.frase(" ... Homms"));

// if(persona1.tieneArma()){console.log("Puede tirar paro...")}
// else{console.log("Nooo, se queda en su casa")}

// console.log("Mi cholo ", persona1.tieneArma());



persona1.arma = "piedra";
/**
 * Ejemplo al encapsular con #(private)
 * No se puede acceder a él
 */
persona1.valorDelArma("cuchillo");
console.log(persona1);





