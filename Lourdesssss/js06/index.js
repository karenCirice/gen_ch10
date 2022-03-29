
function obtenerFormulario (){
    let formulario = document.forms["formulario"];
    let concatenacion = "";
    for( let datos of formulario){
        concatenacion =  concatenacion + " " + datos.value;
    }
    console.log(concatenacion);
}

let borrar = () => {
    document.getElementById("nombre").value = " ";
    document.getElementById("apellido").value = " ";
    document.getElementById("todos").value = " ";
}