//iniciamos con clases y constructor
class cubos {
    tipo;
    color;
    peso;

    //el constructor es donde se colocan los parámetros de los objetos
    constructor(tipo, color, peso){
        //this hace referencia a los atributos de la clase
        this.tipo = tipo;
        this.color = color;
        this.peso = "mediano";
    }

    //con get traemos lo que necesitamos de la clase
    get tipoCubo (){
        return this.tipo;
    }

}

let cuboAgua = new cubos("agua","azul");
let cuboFuego = new cubos("fuego","rojo");

/* console.log(cuboAgua);
console.log(cuboFuego);

console.log(cuboAgua.tipoCubo);
console.log(cuboFuego.tipoCubo); */