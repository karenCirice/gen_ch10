const people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

//console.log(people);
//1.Write a command that prints out all of the people in the list.
people.forEach(element => console.log(element));

//Function to exercise 1 and exercise 2
function remove(array, data) {
    let index = array.indexOf(data);
    array.splice(index, 1);
    console.log(array);
}

//2.Write the command to remove "Dani" from the array.
remove(people, "Dani");

//3.Write the command to remove "Juan" from the array.
remove(people, "Juan");

//4.Write the command to add "Luis" to the front of the array.
remove(people, "Luis");
people.unshift("Luis");
console.log(people);

//5.Write the command to add your name to the end of the array.
people.push("Eli");
console.log(people);

//6.Using a loop, iterate through this array and after console.log "Maria", exit from the loop.
for (let i = 0; i < people.length; i++) {
    console.log(people[i]);
    if(people[i] == 'Maria'){
        //console.log("Maria se encuentra en el indice: ", i);
        break;
    }
}

//7.Write the command that gives the indexOf where "Maria" is located.
console.log("Maria se encuentra en el indice: ", people.indexOf('Maria'));