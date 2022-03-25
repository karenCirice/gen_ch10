console.log("Estoy en JS08");

let persona = { //esto es un objeto
    nombre: "Fabiola", //esto son propiedades
    apellido: "Gonzalez", //esto son propiedades
    email: "karenfggutierrez@gmail.com",
    edad: 23,
    nombreCompleto: function(){
        return `${this.nombre} ${this.apellido} ***`;
    },
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad} años`;
    }
};

console.log(persona.nombre);
console.log(persona["nombre"]); //esta es otra manera de mostrar solo el "nombre" del objeto
persona.nombre = "Karen"; //Con esto podemos cambiar el "nombre"
console.log(persona['nombre']); 
console.log(persona.nombreCompleto());
console.log(persona.nombreYEdad);

/* array = [1,2,3,4];
console.log(array.length);
console.log(array.push(5));
console.log(array); */

