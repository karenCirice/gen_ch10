console.log("Estoy en J08");

let persona = {
    nombre : "Cholisa",
    apellido: "Greñas",
    email: "La Mars@ElCholoEd.com",
    edad: 24,
    nombreCompleto: function (){
    //estamos usando string templates ${} y no es necesario concatenar
        return `${this.nombre} ${this.apellido} ***`;

    },
// otra forma de reservar datos:
get nombreYEdad(){ //funciones reservadas con get no necesitan parentesis
    return `${this.nombre} tiene ${this.edad}`;
}
};

console.log (persona.nombre);
console.log (persona["nombre"] );
persona.nombre ="Cholafne";
console.log (persona['nombre']);
console.log (persona.nombreCompleto());
console.log (persona.nombreYEdad); //funciones reservadas con get no necesitan parentesis
// /************************************************/
// array=[1,2,3,4];
// console.log(array.lenght); //Para obtener el # de datos del arreglo
// console.log (array.push(5)); // Para agregar un neuvo dato al arreglo
// console.log (array); //imprime el arreglo con el nuevo dato