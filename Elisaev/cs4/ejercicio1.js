let arr = ["This", "is", "a", "sentence."];

let final ="";
function printOutString() {
    for (let i=0 ; i < arr.length ; i++) {
        final = final+ " " + arr[i];
    }
}


printOutString();

console.log(final)