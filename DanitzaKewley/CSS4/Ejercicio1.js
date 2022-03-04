let arr = ["This", "is", "a", "sentence."];
function printOutString() {
    let sentence = "";
    arr.forEach(function(palabra){
        sentence += palabra.concat(" ");
    });
    console.log(sentence);
}

printOutString(arr);
