let arreglo = ["This", "is", "a", "sentence."];
function printOutString(arreglo) {
  // your code here
    let resultado = "";
    arreglo.forEach(function(element) {
        resultado += element.concat("");
    });
        console.log(resultado);  
} 
console.log(printOutString(arreglo));