console.log("Sesión JS06");

function obtenerFormulario(){
    let formulario= document.forms["formulario"];
    //console.log(formulario);
    let concatenacion = "";
    for (let i of formulario){
        //console.log(i.value);
       concatenacion = concatenacion + " " + i.value; 
    }
    console.log(concatenacion);
}