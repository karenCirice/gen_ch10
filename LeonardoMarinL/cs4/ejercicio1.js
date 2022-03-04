//Ejercicio 1: completar la función para que diga "This is a sentence"
console.log("Ejercicio ",1);

let arr = ["This", "is", "a", "sentence."];
function printOutString(){
  let frase = "";
  for (let i=0; i<arr.length; i++){
    frase = frase + arr[i] + " ";
  } console.log(frase);
}

printOutString();