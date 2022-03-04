let array = [1, 2, 3, 4];
let sum = 0, product = 1;
   for (let i = 0; i < array.length; i++) {
   sum = (sum + array[i]);
   product = (product * array[i]);
}
console.log("The sum is " + sum, "the product is " + product);
