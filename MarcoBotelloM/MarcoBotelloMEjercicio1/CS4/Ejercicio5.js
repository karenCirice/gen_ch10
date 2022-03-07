let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
 
console.log(people);
let eliminado = people.splice(1,1);
console.log("El dato eliminado es  " + eliminado);
people;
let eliminado2 = people.splice(1,1);
console.log("El segundo dato elimininado es "+ eliminado2);
people.unshift("Luis");
people.push("Marco");
 
for (let i = 0; i < people.legnth ; i++) {
    console.log(people[i]);
}
 
people.indexOf("Maria");
let eliminado3 = people.splice(1,1);
 
console.log(people);

