/*Exercise #2
Write a function that:
•	Takes in an array of numbers.
•	Doubles the value of each number in the array.
•	Prints out the new updated array.
Example: Given an array [1, 2, 4, 5]. The output should be [2, 4, 8, 10]
*/

const array=[1,2,4,5];
const array2 = array.slice();


function multiplicacion(array2){
    for(let i=0; i<array.length;i++){
        array2[i] = array2[i]*2;
    }
    console.log(array2)
}

multiplicacion(array2);
