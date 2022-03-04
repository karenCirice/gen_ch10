// Exercise #1
// Copy the code below into your workspace:
let arr = ["This", "is", "a", "sentence."];
function printOutString(component) {
    let mySentence = "";
    for(let i=0;i<component.length ; i++){
        mySentence += component[i] + " ";
    }
    console.log(mySentence);
}

printOutString(arr);
//Complete the function to print out the string: This is a sentence.
