console.log("js08");

let persona = {
    nombre: "Elisa",
    apellido: "Espinoza",
    email: "elisaev06@gmail.com",
    edad: 25,

    // Crear una funcion dentro del objeto
    nombreCompleto: function() {
        return `${this.nombre} ${this.apellido} ***`;

    }
}


// accede a la clave del objeto
console.log(persona.nombre);
console.log(persona["nombre"]);


console.log(persona.nombreCompleto()); //imprime la funcion dentro del objeto