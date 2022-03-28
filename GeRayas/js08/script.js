console.log("JS08 VIERNES CHOLO");

class Cubos{//Clase Persona
    _tipo; //atributo de la clase
    _color;
    _tamaño;

    constructor(tipo, color){
        this._tipo = tipo; // this hace referencia a los atributos de la clase
        this._color = color;
        this._tamaño = "mediano";
    }

    /**
     * Obtiene el valor "tipo"
     */
    get tipoCubo(){
        return this._tipo;
    }
    /**
     * Cambia el tamaño del cubo
     */
    set tamaño(nuevoTamaño){
        this._tamaño = nuevoTamaño;
    }
    /**
     * Cambia el color del cubo
     */
    set color(nuevoColor){
         this._color = nuevoColor;
    }
    /**
     * Compara para ver si hay color en el cubo
     * @returns {string} Si tiene color o no
     */
    tieneColor(){
        if(this._color != ""){
            return "Quedo de perlas homs";
        }
        else{
            return "No tiene color homs :(";
        }
    }
}

let cuboAgua = new Cubos();
let cuboFuego = new Cubos("fuego","rojo");
cuboFuego.color = "r";

console.log(cuboFuego.tipoCubo);

//Cambio el tamaño del cuboFuego 
cuboFuego.tamaño = "Grande";
console.log(cuboFuego._tamaño);

//Respuesta si el cubo tiene color o no
console.log("¿Color? :", cuboFuego.tieneColor());