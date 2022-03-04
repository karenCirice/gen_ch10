//Ejercicio 3: Escribir un programa que arroje la suma y multiplicación de los valores de un arreglo
console.log("Ejercicio ",3);

let arr3 = [2,6,10,20];
function adición(){
  let suma = 0;
  let multiplicación = 1;
  for (let i=0; i<arr3.length; i++){
    suma = suma + arr3[i];
    multiplicación = multiplicación*arr3[i];
  } console.log("La suma de los valores del arreglo es: ",suma);
  console.log("El producto de los valores del arreglo es: ",multiplicación);
}

adición();