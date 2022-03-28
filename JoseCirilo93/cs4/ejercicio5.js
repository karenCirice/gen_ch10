let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

console.log(people.join(" ,"));

let datoElimenado = people.splice(1, 1);
console.log(people);
console.log("Removido " +datoElimenado);

let datoElimenado2 = people.splice(2, 1);
console.log(people);
console.log("Removido " +datoElimenado2);

people.unshift("Luis");
people.splice(2, 1);
console.log(people.join(" "));

people.push("Jose");
console.log(people.join(" "));

console.log("Maria se encuentra en ",people.indexOf("Maria"));