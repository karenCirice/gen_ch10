console.log("sesion js06");

function obtenerFormulario() {
    let formulario = document.forms["formulario"];
    //console.log(formulario)
    let concatenacion = "";
    for (let i of formulario) {
        //console.log(i.value);
        concatenacion = concatenacion = +' ' + i.value;
    }
    console.log(concatenacion);
    console.log(formulario["nombre"]["name"]);
    console.log(formulario["nombre"]["value"]);
    localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);   
}
//recuperacion de los datos en memoria
function recuperarFormulario(){
    let formulario = document.forms["formulario"];
    console.log("datos en memoria: ", localStorage.etItem(formulario["nombre"["name"]]));
    formulario["nombre"]["value"] = lacalStorage.getItem(formulario["nombre"]["name"]);
}   formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
