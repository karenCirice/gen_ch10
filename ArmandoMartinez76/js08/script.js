console.log("Estoy en Js 08")

let persona = {
    nombre: "Armando",
    apellido: "Martinez",
    apodo: "kakarot",
    edad: 26,
    nombreCompleto: function () {
        //return this.nombre + " " + this.apellido
        return `${this.nombre} ${this.apellido} `
    },
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`
    },

    set cambiarNombre(nombre){
        this.nombre = nombre;
    }
}

console.log(persona.nombre); //obteneruna propiedad
console.log(persona["nombre"] ); //otra forma de obtener una propiedad


persona.nombre = "Jose";

console.log(persona["nombre"] );

console.log(persona.nombreCompleto()); //Invocar un metodo

// Si se hace con get no requerimos los poarentesis
console.log(persona.nombreYEdad);
persona.cambiarNombre = "Armando";
console.log(persona.nombreYEdad);

/*********************************** */
array  =[1,2,3,4,5,6,7,8,9,10];

console.log(array.length);

console.log(array.push(11));

console.log(array)

