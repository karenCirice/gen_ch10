
console.log("Sesión js06")

function obtenerFormulario(){
    let formulario = document.forms["formulario"];
    let concatenacion = "";

    for(let i of formulario){
        concatenacion = concatenacion + " " + i.value;
    }
    console.log(concatenacion);
}