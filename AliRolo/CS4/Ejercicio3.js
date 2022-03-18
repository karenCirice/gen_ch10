const arrayOriginal = [1 ,2 ,3 ,4];
let sum = 0;
let product = 1;
function sumAndProduct(value) {
sum = sum + value;
product = product * value;
}
arrayOriginal.forEach(sumAndProduct);
console.log(sum);
console.log(product);