console.log("sesión js06");

// Datos del formulario
function obtenerFormulario(colorfonfo) {
    colorfondo = "blue";
    // console.log(formulario);
    let formulario = document.forms["formulario"];
    let concatenacion = " ";
    for(let i of formulario){
        //console.log(i.value);
        concatenacion = concatenacion+ " " +i.value;
    }
    console.log(concatenacion);
    console.log(formulario["nombre"]["name"]);
    console.log(formulario["nombre"]["value"]);
    localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);
}   
function recuperarformulario() {
    let formulario = document.forms["formulario"];
    console.log("Datos en memoria", localStorage.setItem(formulario["nombre"]["name"]));
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);
    console.log("Datos en memoria", localStorage.setItem(formulario["apellido"]["name"]));
    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
    
}
// Pone invisible al botón principales del formulario
function setInvisible() {
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.visibility = "hidden"; 
}
// Oculta el botón principal.
function setOcultar() {
    let botonFormulario = document.getElementById("todos");
    botonFormulario.style.display = "none"
}
function recordatorio() {
    let array = ["dato1","dato2","dato3"]
    let objeto = {
        clave: "dato1", clave2: "dato2", clave3:{
            claveinterna:"daroobje1", claveinterna2:"datoobjet2"
        }
    };

}
