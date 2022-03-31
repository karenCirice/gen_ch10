console.log("js06 Obtener y recuperar datos");

/**
 * 
 */
function obtenerFormulario(/*colorFondo*/){
    /*colorFondo="blue";*/

    /*Obtenemmos los datos predeterminados del formulario del HTML, formulario es el objeto que guarda datos del formulario*/
    let formulario = document.forms["formulario"];
    console.log(Object.values(formulario));
    /*Mostramos el objeto que contiene los datos dentro del formulario*/
    console.log(formulario);
    
    /*========PRINCIPIO=======*/
    /*En esta porción declaramos una variable que va a ir almacenando los datos en forma de string que contengan los campos del 
    formulario para mostrarlos en consola y asegurarnos de que lo que se ingresa es lo que se guarda*/
    let concat="";
    for(let i of formulario){
        //console.log(i.value);
        concat=concat+i.value+" ";
    }
    
    /*Instrucción para mostrar */
    console.log(concat);
    /*========FIN=========*/

    /*Mostramos el contenido del campo que guarda el nombre*/
    console.log(formulario.nombreCaja.value);
    /*Mostramos el contenido del campo que guarda el apellido*/
    console.log(formulario.apellidoCaja.value);
    
    /*En estas instrucciones sólo se imprime lo que se tiene guardado en los campos de nombre y apellido*/
    console.log(formulario["nombreCaja"]["value"]);
    console.log(formulario["apellidoCaja"]["value"]);

    /*Aquí se guardan los valores con llave y valor separados por comas*/
    localStorage.setItem(formulario["nombreCaja"]["name"],formulario["nombreCaja"]["value"]);
    localStorage.setItem(formulario["apellidoCaja"]["name"],formulario["apellidoCaja"]["value"]);
}

function recuperarFormulario(){
    /*Creamos el objeto formulario de nuevo para poder manejar su contenido*/
    let formulario=document.forms["formulario"];
    /**mostramos lo que se va a guardar, que exista también en los campos de nombre y apellido, nos referimos
     * a su contenido
     */
    console.log("Datos en memoria: ", localStorage.getItem(formulario["nombreCaja"]["name"]), " ", localStorage.getItem(formulario["apellidoCaja"]["name"]));
    /**Cambiamos el valor que exista en los campos de nombre y apellido con lo que hay guardado en el 
     * local storage, los valores almacenados en el último click
     */
    formulario["nombreCaja"]["value"]=localStorage.getItem(formulario["nombreCaja"]["name"]);
    formulario["apellidoCaja"]["value"]=localStorage.getItem(formulario["apellidoCaja"]["name"]);
}

function recordatorio(){
    let array=["dato1", "dato2", "dato3"];
    let objeto={
        clave1: "dato1", 
        clave2: ["dato1", "dato2", "dato3"], 
        clave3: {
            claveInterna1:"datoobjeto1",
            claveInterna2:"datoobjeto2"}
        };
}

/**
 * 
 */
function setInvisible(){
    let invisible=document.getElementById("nombre");
    invisible.style.visibility="hidden";
}

/**
 * 
 */
function setOcultar(){
    let ocultar=document.getElementById("nombre");
    ocultar.style.display="none";

}