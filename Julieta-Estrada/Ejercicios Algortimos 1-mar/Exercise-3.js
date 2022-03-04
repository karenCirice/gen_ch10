let product = [1, 2, 3, 4];
let sum = 0
let multi = 1
for (let i = 0; i < product.length;i++){
   sum = (sum + product[i])
   multi = (multi * product[i])
}
console.log("The sum is " + sum, "The product is " + multi )
