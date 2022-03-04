//Ejercicio 5
console.log("Ejercicio ",5);

let people = ["María","Dani","Luis","Juan","Camila"];
//1)
function arr5(){
  console.log("1)");
  for (let i=0; i<people.length; i++){
    console.log(people[i]);
  }
}
arr5();

//2) y 3)
function borrar (arreglo,valor){
  let indice = arreglo.indexOf(valor);
  arreglo.splice(indice,1);
  console.log(arreglo);
}

console.log("2)");
borrar(people,"Dani");

console.log("3)");
borrar(people,"Juan");

//4
console.log("4)");
borrar(people,"Luis");
people.unshift("Luis");
console.log(people);

//5
console.log("5)");
people.push("Leonardo");
console.log(people);

//6
console.log("6)");
for (let i=0; i<people.length; i++){
    console.log(people[i]);
    if (people[i]=="María"){
      console.log("7)");
      console.log("El índice de María es: ",i);
      break;
    } 
} 