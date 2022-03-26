let Suma = 0;
let Producto = 1; 

let array= [1,2,3,4]
 
for (let i = 0; i < array.length; i++) {
    Suma += array[i];
}
 
for (let j = 0; j < array.length; j++) {
    Producto *= array[j];
}
 
console.log("La Suma total es "+ Suma);
console.log("El Producto total es "+ Producto);
 
