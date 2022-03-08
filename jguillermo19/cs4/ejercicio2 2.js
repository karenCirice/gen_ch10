//Ejercicio 2: cambiar un arreglo para que sus valores sean el doble

console.log("Ejercicio 2");

function doubleArray() {
  let tam = parseInt(prompt("Ingrese el tamaño del arreglo:"));
  let arr = [];
  let arrDouble = [];
  for (let i = 1; i < tam+1; i++) {
      arr.push(parseInt(prompt("Posicion "+i+", ingrese un numero:")));
      arrDouble.push(parseInt(arr[i-1])*2);
  }
  console.log("Arreglo inicial:");
  console.log(arr);
  console.log("Arreglo doble:");
  console.log(arrDouble);
}

doubleArray();
