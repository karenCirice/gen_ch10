let matriz = [1,2,3,4,5];
let suma = 0;
let producto = 1;

for( i=0; i< matriz.length; i++){
    suma = suma + matriz[i];
    producto = producto * matriz[i];
}console.log(`la suma es de ${suma} y el producto es ${producto}`);