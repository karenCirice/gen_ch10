
// Exercise #3
// Write a program to compute the sum and product (multiplication) of an array of numbers. Print out the sum and the product.
// Example: Given an array [1, 2, 3, 4] The sum is 10. The product is 24.
let mySum = 0, myProduct = 1, myArray = [10,2,48,6];
function printOut(component) {
    for(let i=0;i<component.length ; i++){
        mySum += component[i];
        myProduct *= component[i];
    }
    console.log(`The components in the array are: ${myArray}`);
    console.log(`The sum is ${mySum}. The product is ${myProduct}`);
}
printOut(myArray);
