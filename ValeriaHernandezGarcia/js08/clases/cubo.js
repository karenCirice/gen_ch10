
class Cubos{
    tipo; //atributos de mi cubo
    color;
    size;

    constructor (tipo, color){
        this.tipo = tipo;
        this.color = color;
        this.size = "mediano"; 
    }
    get tipoCubo(){
        return this.tipo;
    }
}

let cuboAgua = new Cubos("Agua", "azul");
let cuboFuego = new Cubos("fuego", "rojo");

//console.log(cuboAgua);
//console.log(cuboFuego); 

console.log(cuboAgua.tipoCubo);
console.log(cuboFuego.tipoCubo);