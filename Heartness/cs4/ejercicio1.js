let arr = ["This", "is", "a", "sentence."];
let a = " ";

function printOutString(value) {
  for(let i = 0; i < value.length; i++){
      a += arr[i] + " ";
  }
  console.log(a);
}

printOutString(arr);