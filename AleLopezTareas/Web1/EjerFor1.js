//función que une strings de un arreglo

let arr = ["This", "is", "a", "sentence."];

function printOutString() {
 
    for(let i=0; i<=arr.length; i++){
        console.log(arr.join(" "));
    }
}
 
printOutString();
