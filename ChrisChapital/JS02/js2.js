function sumar() {
  let num1 = parseInt(document.getElementById("num1").value);
  let num2 = parseInt(document.getElementById("num2").value);
  let sum = num1 + num2;
  
  document.getElementById("result").innerHTML= sum;
  console.log(sum);
}

function restar() {
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    let resta = num1 - num2;
    
    document.getElementById("result").innerHTML= resta;
    console.log(resta);
  }

  function multiplicar() {
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    let multi = num1 * num2;
    
    document.getElementById("result").innerHTML= multi;
    console.log(multi);
  }

  function dividir() {
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt (document.getElementById("num2").value);
    let div = num1 / num2;
    
    document.getElementById("result").innerHTML= div;
    console.log(div);
  }

  Limpiar = () => {
    document.getElementById("num1").value="";
    document.getElementById("num2").value="";
    document.getElementById("result").value="";
  }