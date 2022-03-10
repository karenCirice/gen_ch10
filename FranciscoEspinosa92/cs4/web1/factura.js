/*
let nombre = prompt("Escriba su nombre");
console.log("El nombre es "+nombre);
*/

let cantidadHoras = prompt("¿Cuantas horas trabajo?");
let precioUnitario = prompt("¿Precio por pieza?");
let porcentajeIVA = prompt("¿IVA facturado?","Menor al 100%");
let pDescuento = prompt("¿Cuantas con algun descuento?", "1 para sí, 2 para no");


Subtotal = cantidadHoras*precioUnitario;
pIVAfinal = (porcentajeIVA/100);
ivaDeSub =(Subtotal*pIVAfinal);

Sub =Subtotal+ivaDeSub;
console.log("Subtotal: $"+Subtotal);
console.log("IVA a pagar : $"+ivaDeSub );
console.log("Subtotal con IVA: $ "+Sub);

if(pDescuento == 1)
{
   cualDescuento = prompt("¿De cuanto es tu descuento en porcentaje?"," Menor al monto Total! ");
    t1= (Sub*(cualDescuento/100));
    console.log("Se descuenta: "+ cualDescuento, "(%)"+ " $"+t1);
    t2 = Sub-t1 
    console.log("Total a pagar con descuento: $"+t2);
} 
else
{
 console.log("Total a pagar sin descuento: "+Sub);
}