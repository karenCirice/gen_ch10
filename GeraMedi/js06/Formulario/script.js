//Se realiza un console rápido solo para comprobar que esta linkeada
console.log("Hola Mundo!");

//Función para formulario 
function obtenerFormulario(){
    let formulario = document.forms["formularios"];
    //console.log(formulario);
    //se declara concatenacion para emplearla en el for y que nos arroje los valores en un mismo string
    let concatenacion = "";
    //For of
    for (let i of formulario){
        //.value para que nos dé solo el valor de los datos.
        //console.log(i.value);
        concatenacion = concatenacion + " " + i.value;
    }
    console.log(concatenacion);
}