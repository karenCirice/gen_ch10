let array = [1, 2, 3, 4], suma=0, mult=1;

for(let i=0; i<array.length; i++){
    suma=suma+array[i];
}
console.log("Suma de los elementos del arreglo: %d", suma);

for(let i=0; i<array.length; i++){
    mult=mult*array[i];
}
console.log("Producto de los elementos del arreglo: %d",mult);