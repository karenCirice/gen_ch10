console.log("sesión js06");

/**
 * obtiene los datos del formulario
 */
function obtenerFormulario(){
    let formulario=document.forms["formulario"];
    //console.log(formulario);
let concatenacion = "";
for (let i of formulario){
    //console.log(i.value);
    concatenacion=concatenacion + " " + i.value;
}
console.log(concatenacion);
console.log(formulario.nombre.value);
console.log(formulario.apellido.value);
localStorage.setItem(formulario["nombre"]["name"],formulario["nombre"]["value"]);
localStorage.setItem(formulario["apellido"]["name"],formulario["apellido"]["value"]);

}

/**Recuperación de los datos en la memoria */
function recuperarFormulario(){
    let formulario= document.forms["formulario"];
    console.log("Datos en memoria:",localStorage.getItem(formulario["nombre"]["name"]));
    console.log("Datos en memoria:",localStorage.getItem(formulario["nombre"]["name"]));


}

/**poner invisible el boton principal del formulario */
function serInvisible(){
    let botonFormulario=document.getElementById("todos");
    botonFormulario.style.visibility="hidden";
}