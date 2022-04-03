console.log("conexion con js08 clases");

//El nombre de la clase debe comenzar en mayusculas
class Persona {
    //Atributos de la clase
    _nombre;    
    _apellido;
    _edad;
    _arma;
    
    get nombre() {
        return this._nombre;
    }
    set nombre(value) {
        this._nombre = value;
    }
    get apellido() {
        return this._apellido;
    }
    set apellido(value) {
        this._apellido = value;
    }
    get edad() {
        return this._edad;
    }
    set edad(value) {
        this._edad = value;
    }
    get arma() {
        return this._arma;
    }
    set arma(value) {
        this._arma = value;
        this.valorDelArma(value);
    }

    constructor(nombre, apellido, edad, arma = "") {
        //this hace referencia a los atributos de la clase
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
        this._arma = arma
    }

    frase(frase = ""){
        return `La vida es un riesgo carnal ${frase}`
    }
    tieneArmaString(){
        if(this._arma != ""){
            return "Este es de los mios";
        }
        else{
            return "Se queda viendo Bob Esponja";
        }
    }
    valorDelArma(tipoArma){
        if (tipoArma == "cuerno de chivo"){
            this._apellido += " El Molote";
        }
    }
}

let personaChola = new Persona("aaron", "hernandez", 22,"cuchillo");

personaChola.nombre ="juan";
personaChola.arma = "cuerno de chivo";

console.log(personaChola.apellido);
console.log("Frase 1: ",personaChola.frase());
console.log(personaChola.tieneArmaString());