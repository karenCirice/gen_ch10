console.log("Sesion de clases js08");

let nuevoArray = new Array();
let nuevoArray2 = [1987];
nuevoArray.push()

//EL nombre de las clases en POO comienza con mayusculas

class Persona{
    _nombre;
    _apellido;
    _edad;

constructor(nombre, apellido, edad){ //el constructor inicializa el objeto
    this._nombre = nombre; //el this indica el "nombre" del objeto(Propiedad/atributo), y el otro "nombre" al parametro del constructor
    this._apellido = apellido;
    this._edad = edad; //Los guiones bajos 
}

get nombre(){
    return this._nombre;
}

set nombre(nuevoNombre){
    this._nombre = nuevoNombre;
}

get instrumento(){
    return this._instrumento;
}

set instrumento(nuevoInstrumento){
    this._instrumento = nuevoInstrumento;
    this.valorDelInstrumento(nuevoInstrumento);
}

set banda(nuevaBanda){
    this._banda = nuevaBanda;

}

frase(frase = "La bestia"){
    return `Proximo disco Leviathan II ${frase}`
}

tieneInstrumento(){
    if (this._instrumento == ""){
        return false;
    }
    else{
        return true;
    }
}

tieneInstrumentoSTr(){
    if (this._instrumento != "" ){
        return "Toca instrumento";
    }
    else{
        return "Es cantante"
    }
}

valorDelInstrumento(tipoDeInstrumento){
    if (tipoDeInstrumento=="Guitarra"){
        this._banda += " Guitarrista";
    }
}

}

let integrante1 = new Persona("Lori", "Lewis", 37,);
let integrante2 = new Persona("Linnea", "Vikstrom", 29);

console.log(integrante1);
console.log(integrante2);

console.log("Nombre de la persona 1: ", integrante1.nombre, integrante1.apellido);
console.log("Nombre de la persona 2: ", integrante2.nombre);
integrante2.nombre = "Thomas";
integrante2._edad = 53;
console.log("Nombre de la persona 2: ", integrante2.nombre); //Se cambio el nombre de la persona 2
integrante1.instrumento = "Voz";
integrante2.instrumento = "Guitarra";
integrante1.banda = "Therion";
integrante2.banda = "Therion";

/* console.log("Datos integrante 1: ",integrante1);
console.log("Datos integrante 2: ",integrante2);
console.log("Frase integrante 1: ", integrante1.frase("The beast"));

if (integrante1.tieneInstrumento()){
    console.log("Toca instrumento");
}

else{
    console.log("Es cantante");
}

console.log("Este integrante", integrante1.tieneInstrumento());
 */

console.log(integrante1);

integrante2.instrumento = "Guitarra"
console.log(integrante2);

