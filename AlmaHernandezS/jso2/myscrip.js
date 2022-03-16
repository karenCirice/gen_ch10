function suma(){
    let numero1 = parseInt(document.getElementById("numero1").value);
    let numero2 = parseInt(document.getElementById("numero2").value);
    let resultado = numero1 + numero2;
    document.getElementById("resultado").value = resultado;
   }

   function resta(){
    let numero1 = parseInt(document.getElementById("numero1").value);
    let numero2 = parseInt(document.getElementById("numero2").value);
    let resultado = numero1 - numero2;
    document.getElementById("resultado").value = resultado;
   }

   function multiplicacion(){
    let numero1 = parseInt(document.getElementById("numero1").value);
    let numero2 = parseInt(document.getElementById("numero2").value);
    let resultado = numero1 * numero2;
    document.getElementById("resultado").value = resultado;
   }

   function dividir(){
    let numero1 = parseInt(document.getElementById("numero1").value);
    let numero2 = parseInt(document.getElementById("numero2").value);
    let resultado = numero1 / numero2;
    document.getElementById("resultado").value = resultado;
   }

   function borrar(){
    document.getElementById("numero1").value = "";
    document.getElementById("numero2").value = "";
    document.getElementById("resultado").value = "";
   }

