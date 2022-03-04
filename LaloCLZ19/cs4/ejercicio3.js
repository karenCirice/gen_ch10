//Ejercicio 3
let sum = 0;
let mult = 1;
const arreglo = [1, 2, 3, 4]
function myNumbers(arr) {
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
        mult = mult * arr[i];
    }
    console.log("La suma es: "+sum);
    console.log("La multiplicacion es: "+mult);
    
}

myNumbers(arreglo);