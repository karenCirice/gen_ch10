console.log("Estoy en J08, yea, yea, la muñeca fea");

let persona = {
    nombre:"Cholisa", 
    apellido: "Greñas", 
    email: "LaMars@ElCholoEd.com",
    edad: 24,
    nombreSimple: function(){
        return `${this.nombre} ${this.apellido} ***`;
    },
    get nombreYEdad(){
        return `${this.nombre} tiene ${this.edad} años`;
    }
};

console.log(persona.nombre);
console.log(persona["nombre"]);

persona.nombre = "Cholafne";

console.log(persona["nombre"]);

console.log(persona.nombreSimple());

console.log(persona.nombreYEdad);

array = [1, 2, 3, 4];
console.log(array.length);

console.log(array.push(5));
console.log(array);