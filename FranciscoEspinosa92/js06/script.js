console.log("sesion Js06");

function obtenerFormulario(colorFondo){

    let formulario = document.forms["formulario"];

    let concatenacion =" ";
    for (let i of formulario){ 
        concatenacion = concatenacion +" "+ i.value;
    }
    console.log(concatenacion);
    console.log(formulario.nombre.value);
    console.log(formulario.apellido.value);
    localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);
}

function recuperarFormulario(){
    let formulario = document.forms["formulario"];
    console.log("Datos en la memoria:", localStorage.getItem(formulario["nombre"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);

}

function setInvisible(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility="hidden";

}

function setOcultar(){
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display="none";

}