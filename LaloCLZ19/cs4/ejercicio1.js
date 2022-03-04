//Ejercicio 1

let arr = ["This", "is", "a", "sentence."];
function printOutString() {
    /*
  let text =arr.join(" ");
    console.log(text);
    */
    let text="";
    for (let i = 0; i < arr.length; i++) {
        text += arr[i]+" ";
    }
    console.log(text);
}

printOutString();