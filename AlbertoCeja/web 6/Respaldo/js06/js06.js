console.log("Bienvendio");

function obtener_formulario() {
    let formulario = document.forms["formulario"];
    let concatenacion = "";
    for (let  i of  formulario){
        concatenacion = concatenacion + " " +i.value;
    }
    console.log(concatenacion);