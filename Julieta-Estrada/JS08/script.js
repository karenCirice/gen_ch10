console.log("Estoy en J08, yea, yea, la muñeca fea")

let persona = {
    nombre : "Cholisa", 
    apellido:"Greñas",
    email:"LaMars@elholoed.com",
    edad:24,
    nombreCompleto: function(){
        returne `${this.nombre} ${this.apellido} ***`
        
    },
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad} años`;
    }
};
console.log (persona.nombre);
console.log (persona["nombre"]);

persona.nombre="Cholafne";
console.log(persona["nombre"]);
console.log(persona.nombreCompleto());
console.log(persona.nombreYedad)

/*array = [1,2,3,4]
console.log(array.lenght);
console.log(array.push(5));*/