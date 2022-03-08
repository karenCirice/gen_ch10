//Ejercicio 1: completar la función para que diga "This is a sentence"

console.log("Ejercicio 1");
let arr = ['This','is','a','sentence.'];

function printOutString() {
    // your code here
    let tam = arr.length;
    let palabra = '';
    for (let i = 0; i < tam; i++) {
        palabra= palabra + arr[i] + ' ';
    }
    console.log(palabra);
}

printOutString();