class Cubos{
    tipo;
    color;
    size;
    peso;

    constructor(tipo, color){
        this.tipo = tipo;
        this.color = color;
        // this.size se define como constante
        this.size = 'meadiano';
    }

    // metodo get para llamar la propiedad tipo
    get getTipo(){
        return this.tipo;
    }
}

// instanciamos la clase Cubos
let cuboAgua = new Cubos();
let cuboFuego = new Cubos('fuego', 'rojo');

// Se muestra en consola el tipo de cubo(objeto) mediante el metodo get dentro de la clase
console.log(cuboAgua.getTipo);
console.log(cuboFuego.getTipo);