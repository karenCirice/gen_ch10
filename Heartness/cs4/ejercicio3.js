const genericArray = [1, 2, 3, 4, 5];
let sum = 0;
let prod = 1;

for(let i = 0; i < genericArray.length; i++){
    console.log(genericArray[i]);
    sum += genericArray[i];
    prod *= genericArray[i];
}

console.log("El resultado de la suma es " + sum);
console.log("El resultado del producto es " + prod);