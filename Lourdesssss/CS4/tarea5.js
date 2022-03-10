//Write a command that prints out all of the people in the list.
let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
console.log(people.join());

//Write the command to remove "Dani" from the array.

people.splice(1, 1);
console.log(people.join());

//Write the command to remove "Juan" from the array.

people.splice(3, 1);
console.log(people.join());

//Write the command to add "Luis" to the front of the array

people.splice(people.indexOf("Luis"), 1);
console.log(people.join());

//Write the command to add your name to the end of the array.
people.push("Lourdes");
console.log(people.join());

//Using a loop, iterate through this array and after console.log "Maria", exit from the loop
for(let i = 0; i < people.length; i++){
    console.log(people[i]);
    if(people[i] === "Maria"){
        break;
    }
 }

 //Write the command that gives the indexOf where "Maria" is located
 console.log(people.indexOf("Maria"));
