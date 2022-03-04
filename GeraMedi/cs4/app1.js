let arr = ["This", "is", "a", "sentence."];
     
function printOut() {
    let sentence = "";
    for (let i = 0; i < arr.length; i++) {
        //console.log(arr);
        sentence = sentence + " " + arr[i];
    }
    console.log(sentence);
}
printOut();