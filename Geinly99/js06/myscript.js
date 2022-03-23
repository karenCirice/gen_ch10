/**
 * Obtiene los datos del formulario
 * @param {string} letras determina el tipo de dato 
 */
function obtenerFormulario(letras){
    let formulario = document.forms["formulario"];
    let contenido = "";
    for (let elemento of formulario) {
        contenido += elemento.value+" ";
    }
    document.getElementById("resultado").value = contenido;
}
obtenerFormulario()