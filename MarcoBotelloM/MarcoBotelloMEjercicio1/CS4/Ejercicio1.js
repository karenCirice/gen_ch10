let arr = ["This ", "is ", "a ", "sentence. "];
 
let Completo ="";
 
function printOutString(Array) {
   for (let i = 0; i < arr.length; i++) {
      
      Completo = Completo + "" + arr[i]
   }
} 
printOutString(Array)
console.log(Completo + "");
