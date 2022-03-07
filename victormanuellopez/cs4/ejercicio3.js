const numeros = [1,2,3,4,5];
let suma = 0, producto = 1;

function calcular(numero){
  for (let i = 0; i < numero.length; i++) {
         suma = suma + numero[i];
         producto = producto * numeros[i];
    }
console.log("la suma es: " + suma + " y el producto es: "+ producto);
}

calcular(numeros);