class Cubos{
    tipo;
    color;
    size;
    peso;

    constructor(tipo,color){
        this.tipo = tipo;
        this.color = color;
        this.size = "mediano";
    }
    get tipoCubo(){
        return this.tipo;
    }
}

let cuboFuego = new Cubos("fuego","rojo");
let cuboAgua = new Cubos();

console.log(cuboFuego);
console.log(cuboAgua);

console.log(cuboFuego.tipoCubo); //llamando un método hecho con get 
console.log(cuboAgua.tipoCubo);
