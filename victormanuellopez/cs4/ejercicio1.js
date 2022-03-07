let arr = ["Esto", "es", "a", "frase"];

function printOutString(cadena) {
    for (let i = 0; i < cadena.length; i++) {
        cadena[2] = "una";
        console.log(cadena[0]+" "+cadena[1] + " "+ cadena[2] + " "+ cadena[3]);         
    }
}

printOutString(arr);