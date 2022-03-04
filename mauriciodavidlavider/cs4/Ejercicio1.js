
let arr = ["This", "is", "a", "sentence."];

function printOutString(entrada) {
    let salida = "";
    for(let i=0; i<entrada.length; i++){
        salida += entrada[i];
        if (i!=entrada.length-1) salida += " ";
    }
    console.log(salida);
}

printOutString(arr);
