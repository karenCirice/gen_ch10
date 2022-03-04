//Ejercicio 1
 
let arr = ["This", "is", "a", "sentence."];
 
console.log(arr.length);
 
function printOutString() {
 console.log(arr.join(" "));
}
 
printOutString();
 
//Ejercicio 2
console.log("EJERCICIO 2------------");
let numeros = [1,2,4,5];
let numeros2 = [102,18,23,56];
 
function valorPorDos(arreglo){
 
   for(let i = 0; i < arreglo.length; i++){
 
       arreglo[i] = arreglo[i] * 2;
      
   }
   console.log(arreglo);
 
}
 
valorPorDos(numeros);
valorPorDos(numeros2);
 
 
//Ejercicio 3
 
 
function sumaProducto(arreglo){
   let suma = 0;
   let producto = 1;
   for(let i = 0; i < arreglo.length; i++){
       suma = suma + arreglo[i];
       producto = producto*arreglo[i];
   }
   console.log(`SUMA: ${suma} \tPRODUCTO: ${producto}`);
}
 
let arregloNumeros = [1,2,3,4];
 
sumaProducto(arregloNumeros);
 
//EJERCICIO 4
console.log("EJERCICIO 4");
function duplicados(arreglo1,arreglo2){
  
   for(let i = 0; i<arreglo1.length;i++){
      
       for(let j = 0; j < arreglo2.length;j++){
 
           if(arreglo1[i] === arreglo2[j]){
               console.log(`La materia ${arreglo2[j]} esta en ambos arreglos`);
           }
 
       }
 
   }
 
}
 
let student1Courses = ['Math', 'English', 'Programming'];
let student2Courses = ['Geography', 'Spanish', 'Programming'];
 
duplicados(student1Courses,student2Courses);
 
 
//EJERCICIO 5
 
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
people.push("Ernesto");
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
 
