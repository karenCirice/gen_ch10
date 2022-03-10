const people = ["María", "Dani", "Luis", "Juan", "Camila"];

// 1. Comando para imprimir a todas las personas de la lista
console.log(people);
// 2. Comando para borrar a Dani de la lista 
var removed = people.splice(-4, 1);
console.log(people);
// 3. Comando para eliminar a Juan de la lista
var removed = people.splice(-2, 1);
console.log(people);
// 4. Comando para agregar "Luis" enfrente de la lista 
people.unshift('Luis');
var remov = people.splice(-2, 1);
console.log(people);
// 5. Agregar mi nombre al final de la lista
people.push("Alejandra")
console.log(people);
// 6. Ciclo for y terminando imprima "María"
for (let i = 0; i < people.length; i++) {
    console.log("...");
}
console.log("María");
// 7. Comando que nos dice el índice donde está María
people.indexOf("María"); 
