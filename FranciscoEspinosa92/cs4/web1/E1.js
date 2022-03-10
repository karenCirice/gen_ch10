let arr = ["This", "is", "a", "sentence."];
let g ="";
function printOutString() 
{
 for(i=0; i<=arr.length-1 ; i++){
 //  console.log(arr[i] + " " );
 // g=arr[i]
  g= g +" " + arr[i]; 
  
 }

}

printOutString();
console.log(g);