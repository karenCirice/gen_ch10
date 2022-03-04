//Ejercicio 2: cambiar un arreglo para que sus valores sean el doble
console.log("Ejercicio ",2);

let arreglo = [15,30,45,60,75,90];
function arr2(){
  for (let i=0; i<arreglo.length; i++){
    arreglo[i] = arreglo[i]*2;
  } 
}
console.log("El arreglo original es: ",arreglo);
arr2()
console.log("El arreglo con sus valores duplicados es: ",arreglo);