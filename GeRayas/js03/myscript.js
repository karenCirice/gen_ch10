//Función Calcular
function calcular() {
    let día = parseInt(document.getElementById("día").value);
    let mes = parseInt(document.getElementById("mes").value);
    let año = parseInt(document.getElementById("año").value);
    let fecha = new Date(año,mes,día);
    let resultado = fecha.getDay();
    document.getElementById("resultado").value = resultado;
}
/*FUNCIÓN LIMPIAR*/
function limpiar(){
    document.getElementById("Formulario").reset();
 }