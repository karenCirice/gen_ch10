console.log("Sesion de clases")
//El nombre de la clase
class Cubos{
    tipo;
    color;
    tamaño;
    peso;

    constructor(tipo, color){
        this.tipo = tipo;
        this.color = color;
        this.tamaño = "mediano";
    }

    get tipoCubo(){
        return this.tipo;
    }
}

let cuboAgua = new Cubos();
let cuboFuego = new Cubos("fuego", "rojo");

console.log(cuboAgua);
console.log(cuboFuego);

console.log(cuboFuego.tipoCubo);