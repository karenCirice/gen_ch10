/**
 * Obtiene los datos del formulario.
 */
function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    //console.log(formulario);
    let concatenacion = "";
    for (let i of formulario) {
      //console.log(i.value);
      concatenacion = concatenacion + " " + i.value;  
    }
    console.log(concatenacion);
}