// Ejercicio 1 
let arr = ["This", "is", "a", "sentence."];
console.log(arr.length);
function printOutString() {
  console.log(arr.join(" "));
}
 
printOutString();
 
//Ejercicio 2 
let number = [2,4,6,8];
function double(arrreglo){
for(let i=0; i< arrreglo.length; i++){
  arrreglo[i]= arrreglo[i] * 2; 
 }
 console.log(arrreglo);
}
double(number);
 
//Ejercicio 3 
let arregloNumero =[1,2,3,4]
function sumaProducto(Arreglo){
 let suma =0;
 let producto=1;
 for(let i=0; i<Arreglo.length; i++){
   suma = suma + Arreglo[i];
   producto = producto * Arreglo[i];
 } console.log(`El valor de la suma es igual a ${suma} y el valor de la multiplicación es igual a ${producto}`);
}
sumaProducto(arregloNumero);
 
//Ejercicio 4 
let student1Courses = ['Math', 'English', 'Programming'];
let student2Courses = ['Geography', 'Spanish', 'Programming'];
 
function duplicados(arreglo1, arreglo2){
    for(let i=0; i<arreglo1.length; i++){
        for (let j=0; j<arreglo2.length; j++){
            if (arreglo1[i] === arreglo2[j]){
                console.log(`The assignment ${arreglo1[i]} it´s present in both arrays`);
 
            }
        }
    }
}
duplicados(student1Courses,student2Courses);
 
//Ejercicio 5 
let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
console.log(people);
people.splice(people.indexOf("Dani"), 1);
console.log(people);
people.splice(people.indexOf("Juan"), 1);
console.log(people);
people.splice(people.indexOf("Luis"),1);
people.unshift("Luis");
console.log(people);
people.push("Gisel");
console.log(people);
for (let i=0; i<people.length; i++){
    console.log(people[i]);
    if (people[i]=== "Maria"){
        break;
    }
}
console.log(people.indexOf("Maria"));
