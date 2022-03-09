const numeros = [1, 2, 3, 4];
let sum = 0;
let prod = 1;

for(let i = 0; i < numeros.length; i++){
   
    sum += numeros[i];
    prod *= numeros[i];
}

console.log("El resultado de la suma es " + sum);
console.log("El resultado del producto es " + prod);