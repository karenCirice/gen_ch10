
let arr = [1, 2, 3, 4];

function suma(entrada) {
    let suma = 0;
    for(let i=0; i<entrada.length; i++){
        suma += entrada[i];
    }
    return suma
}

function producto(entrada) {
    let producto = 1;
    for(let i=0; i<entrada.length; i++){
        producto *= entrada[i];
    }
    return producto
}

console.log("La suma es:",suma(arr),"El producto es:",producto(arr));
