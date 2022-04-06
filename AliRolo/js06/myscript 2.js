console.log("Iniciando Script...");

function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    //console.log(formulario);
    let concatenacion = " ";
    for (let i of formulario){
        //console.log(i.value);
       concatenacion = concatenacion + " " + i.value;
    }
    console.log(concatenacion);
    console.log(formulario.nombre.value);
    console.log(formulario.apellido.value);
    localStorage.setItem("nombre", formulario.nombre.value);
    localStorage.setItem("apellido", formulario.apellido.value);
}

function recuperarFormulario(){
    console.log("Datos en memoria: ", localStorage.getItem("nombre"));

    console.log("Datos en memoria: ", localStorage.getItem("apellido"));

    document.getElementById("nombre").value = localStorage.getItem("nombre");

    document.getElementById("apellido").value = localStorage.getItem("apellido");
}
