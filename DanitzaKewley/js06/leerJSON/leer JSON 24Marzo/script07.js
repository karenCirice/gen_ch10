console.log("Inicia mi Js");
console.log("Se pueden poner más instrucciones");


/* otra funcion asincrona es setTimeout que sirva para arrojar un mensaje despues de cierto tiempo */


setTimeout(() => console.log("Aparece este mensaje despues de 5 segundos"), 5000)

fetch ("colors.json")
.then (respuesta => respuesta.json)
.then (respuestadelJSON =>{
    console.log(respuestadelJSON);
    console.log("Termina el Fetch");
    return "Los datos para usar en el siguiente .then";
})
/* Se hizo para extender y consumir/recibir lo del return e imprime lo del return */
.then (mensaje => console.log(mensaje));

console.log("Final del fetch y de mi js");