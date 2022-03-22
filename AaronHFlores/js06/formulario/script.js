function obtenerFormulario(){
    let formulario =document.forms["formulario"];
    console.log(formulario);
    let concatenacion = "";
    for (const elem of formulario) {
        concatenacion += " " + elem.value;
    }
    console.log(concatenacion);
}