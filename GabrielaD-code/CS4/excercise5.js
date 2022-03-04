
// Exercise #5
// For each of the exercises below, assume you are starting with the following people array.
let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

// 1.	Write a command that prints out all of the people in the list.
people.forEach(element => console.log(element));

// 2.	Write the command to remove "Dani" from the array.
let fakePeople1 = people.slice(0,5);
fakePeople1.splice(1,1);
console.log(fakePeople1);

// 3.	Write the command to remove "Juan" from the array.
let fakePeople2 = people.slice(0,5);
fakePeople2.splice(3,1);
console.log(fakePeople2);

// 4.	Write the command to add "Luis" to the front of the array.
let morePeople1= people.slice(0,5);
morePeople1.unshift("Luis");
console.log(morePeople1);

// 5.	Write the command to add your name to the end of the array.
let morePeople2 = people.slice(0,5);
morePeople2.push("Gabriela");
console.log(morePeople2);
console.log(people);

// 6.	Using a loop, iterate through this array and after console.log "Maria", exit from the loop.
for(let i=0; i<people.length ; i++){
     //console.log(people[i]);
    if(people[i] == "Maria"){
        console.log(people[i]);
        break;
    }else{console.log(people[i]);}
}

// // 7.	Write the command that gives the indexOf where "Maria" is located.
console.log(people.indexOf("Maria"));
console.log(people.indexOf("Luis"));

// At the end of the exercise, there should be 5 people in the array.
console.log(people);
