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
    }

};

console.log(persona.nombre);
console.log(persona["nombre"]);
persona.nombre = "Cholafne";
console.log (persona[`nombre`]);
console.log(persona.nombreCompleto());
console.log(persona.nombreYEdad);