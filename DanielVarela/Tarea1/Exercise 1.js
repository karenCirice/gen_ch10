let arr = ["This", "is", "a", "sentence."];
function printOutString() {
  let str = "";
  for (i = 0; i < arr.length; i++)
  {
      str += arr[i] + " ";
  }
  console.log(str);
}

printOutString();
