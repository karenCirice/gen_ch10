// Variables obtenidas desde el documento HTML
let num1 = document.getElementById('value1');
let num2 = document.getElementById('value2');
let result = document.getElementById('result');

//Operaciones de suma, resta, multiplicación y división usando la función flecha
const suma = () => result.value= parseInt(num1.value)+parseInt(num2.value);
const resta = () => result.value= parseInt(num1.value)-parseInt(num2.value);
const multiplicacion = () => result.value= parseInt(num1.value)*parseInt(num2.value);
const division = () => result.value= parseInt(num1.value)/parseInt(num2.value);
