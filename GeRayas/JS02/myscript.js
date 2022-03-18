/* FUNCIÓN SUMA */
function suma() {
   let valorA = parseInt(document.getElementById("valorA").value);
   let valorB = parseInt(document.getElementById("valorB").value);
   let resultado = valorA+valorB;
   document.getElementById("resultado").value=resultado;
}
/* FUNCIÓN RESTA */
function resta() {
   let valorA = parseInt(document.getElementById("valorA").value);
   let valorB = parseInt(document.getElementById("valorB").value);
   let resultado = valorA-valorB;
   document.getElementById("resultado").value=resultado;
}
/* FUNCIÓN DIVISIÓN */
function div() {
   let valorA = parseInt(document.getElementById("valorA").value);
   let valorB = parseInt(document.getElementById("valorB").value);
   let resultado = valorA/valorB;
   document.getElementById("resultado").value=resultado;
}
/* FUNCIÓN MULTIPLICACIÓN */
function mul(){
let valorA = parseInt(document.getElementById("valorA").value);
let valorB = parseInt(document.getElementById("valorB").value);
let resultado = valorA*valorB;
document.getElementById("resultado").value=resultado;
}
/*FUNCIÓM LIMPIAR*/
 limpiar=() => {
   document.getElementById("Formulario").reset();
}