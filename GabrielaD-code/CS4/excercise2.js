// Exercise #2
// Write a function that:
// •	Takes in an array of numbers.
// •	Doubles the value of each number in the array.
// •	Prints out the new updated array.
// Example: Given an array [1, 2, 4, 5]. The output should be [2, 4, 8, 10]
const myArray = [3,66,9,78,10];
function printArrayDuplex(oneElement){
    oneElement.forEach(element => 
        console.log((element)*2)
    );
}
printArrayDuplex(myArray);