console.log ("estoy en J08");

let persona = {
    nombre: "Cholisa",
    apellido: "greñas",
    email: "LaMars@ElCholoEd.com",
    edad: 24,
    nombreCompleto: function(){
        return `${this.nombre} ${this.apellido} ***`;
    },
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`;
    },
    set cambiarNombre(nombre){
        this.nombre = nombre;
    }

};

console.log(persona.nombre); //obtener una propiedad del objeto
console.log(persona["nombre"]); //otra forma de obtener una propiedad
persona.nombre = "Cholafne"; //forma de cambiar el valor de una propiedad
console.log (persona[`nombre`]);
console.log(persona.nombreCompleto()); //invocar el método de un objeto
console.log(persona.nombreYEdad); //invocar un método realizado con get
persona.cambiarNombre ="Carlos"; //cambiar el nombre con el método establecido con set
console.log(persona.nombreYEdad); //lee el nombre reestablecido