/Ej 1
let arr = ["This", "is", "a", "sentence."];
function printOutString() {
    let sentence = '';
    for(let i = 0; i < arr.length; i++) {
        //console.log(arr[i],'');
        sentence = sentence + " " + arr[i];
    }
  console.log(sentence);
}

printOutString();

// Ej 2
let arr = [1, 2, 3, 4];

    for(let i = 0; i < arr.length; i++) {
        arr[i] = (arr[i] * 2);

 
    } 
 console.log(arr);

 //ej 3

 let arr = [1, 2, 3, 4];
 let sum = 0, product = 1;
  for (let i = 0; i < arr.length; i++) {
  sum+=arr[i];
    product*=arr[i];
    
  }
 console.log("La suma es: " + sum + " El producto es: " + product);

//Ej 4

let student1Courses = ['Math', 'English', 'Programming'];
let student2Courses = ['Geography', 'Spanish', 'Programming'];

for(let i = 0; i < student1Courses.length; i++){
for(let j = 0; j < student2Courses.length; j++){
    if(student1Courses[i].toLowerCase() == student2Courses[j].toLowerCase()){
            console.log(student1Courses[i]);
    }
  
  }
}
//ej 5
let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
 
//1 Write a command that prints out all of the people in the list.
console.log(people);
//2 Write the command to remove "Dani" from the array.
people.splice(people.indexOf("Dani"),1);
console.log(people);
//3 Write the command to remove "Juan" from the array.
people.splice(people.indexOf("Juan"),1);
console.log(people);
//4 Write the command to add "Luis" to the front of the array.
people.splice(people.indexOf("Luis"),1);
people.unshift("Luis");
console.log(people);
//5 Write the command to add your name to the end of the array.
people.push("Daniel");
console.log(people);
//6 Using a loop, iterate through this array and after console.log "Maria", exit from the loop.
for(let i = 0; i < people.length; i++){
   console.log(people[i]);
   if(people[i] === "Maria"){
       break;
   }
}
 
//7 Write the command that gives the indexOf where "Maria" is located.
console.log(people.indexOf("Maria"));
 
console.log(people);

//-------------------------------------------------------------
let people = ["Maria", "Dani", "Luis", "Juan", "Camila"]; // <<<--------------
 
people.splice(people.indexOf("Camila", 0),1);       //Para borrar algun nombre
console.log(people);