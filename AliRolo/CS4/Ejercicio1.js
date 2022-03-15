const arr = ["This", "is", "a", "sentence."];
let sentence = ""
function printOutString(word){
sentence = sentence + word + " ";
}
arr.forEach(printOutString);
console.log(sentence);