//Ejercicio 5

console.log("Ejercicio 5");

let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

//1.	Write a command that prints out all of the people in the list.
console.log(people);

//2.	Write the command to remove "Dani" from the array.
var index = people.indexOf("Dani");
people.splice(index, 1);
console.log(people);

//3.	Write the command to remove "Juan" from the array.
var index = people.indexOf("Juan");
people.splice(index, 1);
console.log(people);

//4.	Write the command to add "Luis" to the front of the array.
people.splice(1, 1);
people.unshift("Luis");
console.log(people);

//5.	Write the command to add your name to the end of the array.
people.push("Guillermo");
console.log(people);

//6.	Using a loop, iterate through this array and after console.log "Maria", exit from the loop.
let tam = people.length;
for (let i = 0; i < tam; i++) {
  if(people[i]==="Maria"){
    console.log(people[i]);
    break;
  }else{
    console.log(people[i]);
  }
}

//7.	Write the command that gives the indexOf where "Maria" is located.
for (let i = 0; i < tam; i++) {
  if(people[i]==="Maria"){
    console.log("Persona encontrada en la posicion: ", i+1);
  }
}
  