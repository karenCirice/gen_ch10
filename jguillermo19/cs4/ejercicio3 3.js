//Ejercicio 3: Escribir un programa que arroje la suma y multiplicación de los valores de un arreglo

console.log("Ejercicio 3");

function sumProduct(){
  let tam = parseInt(prompt("Ingrese el tamaño del arreglo:"));
  let arr = [];
  let sumT = 0;
  let proT = 1;
  for (let i = 1; i < tam+1; i++) {
      arr.push(parseInt(prompt("Posicion "+i+", ingrese un numero:")));
  }
  for (let i = 0; i < tam; i++) {
      sumT=sumT+arr[i];
      proT=proT*arr[i];
  }
  console.log("Arreglo inicial:");
  console.log(arr);
  console.log("Suma de elementos: " + sumT);
  console.log("Producto de elementos: " + proT);
}

sumProduct();
