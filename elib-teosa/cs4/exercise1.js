const arr = ["This", "is", "a", "sentence."];
function printOutString() {
    let cadena="";
    for (let i = 0; i < arr.length; i++) {
      cadena+=arr[i]+" ";
    }
    console.log(cadena);
}

printOutString();