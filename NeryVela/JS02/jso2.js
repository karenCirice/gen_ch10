function myfunction(){
  let i= parseFloat(document.getElementById("a_1").value); /* Se asigna a la variable i el valor ingresado en el campo de entrada de HTML con identificador "a_1" */
  let j= parseFloat(document.getElementById("b_1").value); /* Se asigna a la variable j el valor ingresado en el campo de entrada de HTML con identificador "b_1" */
  let sum=i+j;
  document.getElementById("c_1").innerHTML = sum; /* Se asigna la operacion de suma con variable "sum" en la función especial para mostrar texto en html con identificador "c_1" y presentarlo en el campo de salida de HTML */
}

function myfunction_1(){
  let i= parseFloat(document.getElementById("a_1").value);
  let j= parseFloat(document.getElementById("b_1").value);
  let res=i-j;
  document.getElementById("c_1").innerHTML = res; /* Se asigna la operacion de resta con variable "res" en la función especial para mostrar texto en html con identificador "c_1" y presentarlo en el campo de salida de HTML */
}

function myfunction_2(){
  let i= parseFloat(document.getElementById("a_1").value);
  let j= parseFloat(document.getElementById("b_1").value);
  let mul=i*j;
  document.getElementById("c_1").innerHTML = mul; /* Se asigna la operacion de producto con variable "mul" en la función especial para mostrar texto en html con identificador "c_1" y presentarlo en el campo de salida de HTML */
}

function myfunction_3(){
  let i= parseFloat(document.getElementById("a_1").value);
  let j= parseFloat(document.getElementById("b_1").value);
  let div=i/j;
  document.getElementById("c_1").innerHTML = div; /* Se asigna la operacion de división con variable "div" en la función especial para mostrar texto en html con identificador "c_1" y presentarlo en el campo de salida de HTML */
}

