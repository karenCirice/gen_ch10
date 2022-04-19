
class Cubos{
    tipo; // atributos de mi cubo
    color;
    size;
    peso;

    constructor (tipo, color){
        this.tipo = tipo;
        this.color = color;
        this.size = "mediano";
    }

    get tipoCubo(){
        return this.tipo;
    }

}

let cuboAgua = new Cubos();
let cuboFuego = new Cubos("fuego","rojo"); // instanciamos la clase cubos

//console.log(cuboAgua);
//console.log(cuboFuego);


console.log(cuboAgua);
console.log(cuboFuego.tipoCubo);