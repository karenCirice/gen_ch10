let array= [1,4,5,6]
 
let Sum = 0;
let Mul = 1;  //No se puede multiplicar por 0, por eso el Uno. 
 
for (let i = 0; i < array.length; i++) {
    Sum += array[i];
}
 
for (let i = 0; i < array.length; i++) {
    Mul *= array[i];
}
 
console.log("The Sum total is"+ Sum);
console.log("The Product total is"+ Mul);
 
