/*
Exercise #3
Write a program to compute the sum and product (multiplication) of an array of
numbers. Print out the sum and the product.
Example: Given an array [1, 2, 3, 4] The sum is 10. The product is 24.
*/

const arreglo = [1,2,3,4];

function suma(arreglo) {
    let sumatoria=0;
    for (let i=0; i<arreglo.length; i++) {
        sumatoria += arreglo[i];
    }
    return sumatoria;
}

function multiplicacion(arreglo) {
    let producto=1;
    for (let i=0; i<arreglo.length; i++) {
        producto *= arreglo[i];
    }
    return producto;
}

console.log("The sum is "+suma(arreglo));
console.log("The product is "+multiplicacion(arreglo));
