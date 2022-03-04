/*
Exercise #2
Write a function that:
* Takes in an array of numbers.
* Doubles the value of each number in the array.
* Prints out the new updated array.
Example: Given an array [1, 2, 4, 5]. The output should be [2, 4, 8, 10]
*/

let arreglo = [1,2,4,5];
let copiaArreglo = arreglo.slice();

function multiplicacion (copiaArreglo) {
    for (let i=0; i<copiaArreglo.length; i++) {
        copiaArreglo [i] = copiaArreglo[i] * 2;
    }
    console.log(copiaArreglo);
}

multiplicacion(copiaArreglo);
