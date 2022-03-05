let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
    console.log(people.join(", ")); //Ejercicio #1

function borrar(arreglo, dato) {
 let index = arreglo.indexOf(dato);
 arreglo.splice(index, 1);
    console.log(arreglo);
}

borrar(people, "Dani"); //Ejercicio #2

borrar(people, "Juan"); //Ejercicio #3

people.unshift("Luis"); //Ejercicio #4
console.log(people);

people.push("Karen"); //Ejercicio #5
console.log(people);

for(let i=0; i<people.length; i++) { //Ejercicio #6
    console.log(people[i]);
       if(people[1] == "Maria") {
 break;        
       }
}

console.log("Maria se encuentra en el índice: " + people.indexOf("Maria")); //Ejercicio #7
