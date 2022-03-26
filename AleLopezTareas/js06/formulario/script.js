console.log("Funciomna j06");

function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    let concatenacion="";
    for (let i of formulario){
        concatenacion = concatenacion + " " + i.value;
    }
    console.log(concatenacion);
    console.log(formulario ["nombre"]["name"]);
    console.log(formulario ["apellido"]["value"]);
    localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);


}

function recuperarFormulario(){
    let formulario= document.forms["formulario"];
    console.log("Datos en memoria: ", localStorage.getItem(formulario["nombre"]["name"]));
    formulario.nombre.value=localStorage.getItem(formulario["nombre"]["name"]);
}

function setInvisible(){
    let botonFormulario=document.getElementById("todos");
    botonFormulario.style.visibility = "hidden";

}
function setOcultar(){
    let botonFormulario=document.getElementById("todos");
    botonFormulario.style.display = "none";
    
}