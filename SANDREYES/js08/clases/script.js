console.log("J08 Estamos en sesión de clases, ese loko");

let nuevoArray = new Array(5);
let nuevoArray2= [50] ;
nuevoArray.pop(20);


// El nombre de las clases debe comenzar en mayusculas
class Persona{
    _nombre;  //atributos de la clase
    _apellido;
    _edad;
    _arma;
    _banda;

    constructor(nombre, apellido, edad){
        this._nombre = nombre; //this hará referencia a los atributos de las clases
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
}

/** 
 * @param {string} nuevaBanda  banda a la que pertenece 
 */

set banda(nuevaBanda){
    this._banda = nuevaBanda;
}

frase(frase = "vato loko"){
    return `la vida es un riesgo carnal ${frase}`

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
 * @returns {string} frase de guerra
 */
tieneArmaStr(){
    if(this._arma != ""){
        return "Este es de los mios";
    }
    else{
        return "Se queda viendo Bob Esponja"
    }
}
}

//valorDelArma(tipoArma){
  //  if (this._arma=="cuchillo"){
    //    this._apellido += "El cuchillos";
    //}
//}


let persona1 = new Persona ("El Dedotes", "Bardan",50);
let persona2 = new Persona ("El Billetes", "Rayas");

//console.lo(persona1);
//console.log(persona2);
console.log("Nombre Persona 1:",persona1.nombre);
console.log("Nombre Persona 2:",persona2.nombre);
persona2.nombre = "El centavos";
console.log("Nombre Persona 2:",persona2.nombre);
persona1.arma= "pica hielo";
persona2.arma= "cuchillo";
persona1.banda=13;
persona2.banda= "Vatos Lokos";
//console.log("Datos Persona 1:",persona1);
//console.log("Datos Persona 2:",persona2);
console.log("frase P1: ", persona1.frase("rastacuas"));

if (persona1.tieneArma()){
    console.log("puede ir al enfrentamiento");
}
else{
    console.log("se queda en su casa");
}

console.log ("Mi cholo ", persona1.tieneArmaStr());

persona1.arma = "chacos"
console.log(persona1 );