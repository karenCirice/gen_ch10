/*Exercise #3
Write a program to compute the sum and product (multiplication) of an array of numbers. 
Print out the sum and the product.
Example: Given an array [1, 2, 3, 4] The sum is 10. The product is 24.
*/

const numeros = [1,2,3,4];

function sumaYmul(arreglo){

    let suma = 0, mul= 1;
    for(let i=0; i<numeros.length; i++){
        suma+=arreglo[i];
        mul*=arreglo[i];
    }
    
    console.log("La suma es:",suma, "Y la multiplicacion:",mul);
}

sumaYmul(numeros);