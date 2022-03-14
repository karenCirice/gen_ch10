let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

/*Primera indicación, Write a command that prints out all of the people in the list*/
console.log(people.join(" "));

/*Segunda indicación, Write the command to remove "Dani" from the array*/
people.splice(1, 1);
console.log(people.join(" "));

/*Tercera instrucción, Write the command to remove "Juan" from the array.*/
people.splice(2, 1);
console.log(people.join(" "));

/*Cuarta, Write the command to add "Luis" to the front of the array*/
people.unshift("Luis");
people.splice(2, 1);
console.log(people.join(" "));

/*Quinta, Write the command to add your name to the end of the array.*/
people.push("Marcos");
console.log(people.join(" "));

/*Sexta, Using a loop, iterate through this array and after console.log "Maria", exit from the loop.*/
for(let i=0; i<people.length; i++){
    console.log(people[i]);
    if(people[i]=="Maria"){
        break;
    }
}

/*Séptima, Write the command that gives the indexOf where "Maria" is located.*/
console.log("Maria se encuentra en el incide: %d", people.indexOf("Maria"));
console.log("En total quedan 4 elemntos:",people.join(" "));