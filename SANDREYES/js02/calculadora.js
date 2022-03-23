let sumar=()=>{
    let numero1=parseInt(document.getElementById("numero1").value);
    let numero2=parseInt(document.getElementById("numero2").value);
document.getElementById("resultadototal").value= (numero1+numero2);
}

let restar=()=>{
  let numero1=parseInt(document.getElementById("numero1").value);
  let numero2=parseInt(document.getElementById("numero2").value);
document.getElementById("resultadototal").value= (numero1-numero2);
}

let multiplicar=()=>{
  let numero1=parseInt(document.getElementById("numero1").value);
  let numero2=parseInt(document.getElementById("numero2").value);
document.getElementById("resultadototal").value= (numero1*numero2);
}

let dividir=()=>{
  let numero1=parseInt(document.getElementById("numero1").value);
  let numero2=parseInt(document.getElementById("numero2").value);
document.getElementById("resultadototal").value= (numero1/numero2);
}

let borrar=()=>{
  document.getElementById("numero1").value="";
  document.getElementById("numero2").value="";
  document.getElementById("resultadototal").value="";
}