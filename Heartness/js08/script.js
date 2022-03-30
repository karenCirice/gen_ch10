console.log("Código de js08 funcionando !!")

let persona = {
    nombre: "Eddie",
    apellido: "Tena",
    email: "eddie.edwward97@gmail.com",
    edad: 25,
    nombreCompleto: function(){
        return `${this.nombre} ${this.apellido}`;
    },
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad}`
    }
}

persona.nombre = "MC Ed";

console.log(persona["nombre"])

console.log(persona.nombreCompleto());

console.log(persona.nombreYEdad);