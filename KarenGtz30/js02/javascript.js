function suma() {
  let a = parseInt(document.getElementById("primerNumero").value);
  let b = parseInt(document.getElementById("segundoNumero").value);
  let suma = a + b;
  console.log(suma);
  document.getElementById("resultado").value = suma;
}

function resta() {
  let a = document.getElementById("primerNumero").value;
  let b = document.getElementById("segundoNumero").value;
  let resta = a - b;
  console.log(resta);
  document.getElementById("resultado").value = resta;
}

function mult() {
  let a = document.getElementById("primerNumero").value;
  let b = document.getElementById("segundoNumero").value;
  let mult = a * b;
  console.log(mult);
  document.getElementById("resultado").value = mult;
}

function division() {
  let a = document.getElementById("primerNumero").value;
  let b = document.getElementById("segundoNumero").value;
  let division = a / b;
  console.log(division);
  document.getElementById("resultado").value = division;
}

clearform = () => {
  document.getElementById("primerNumero").value = "";
  document.getElementById("segundoNumero").value = "";
  document.getElementById("resultado").value = "";
};
