let arr = ["This", "is", "a", "sentence."];
let g = "";
function printOutString() {
  for(i=0; i<arr.length; i++){
   g = g + " " + arr[i];
    
  }
}
printOutString();
console.log(g);