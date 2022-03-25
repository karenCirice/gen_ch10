console.log("JSO6 inicio de mjs");
console.log("Muchas instrucciones");

function myFunction(){
  timeout= setTimeout(()=>console.log("Mensaje retardo 3s."),3000);
}

fetch("colors.json")
.then(respuestaFetch => respuestaFetch.json())
.then (respuestaConversionJson =>{
    console.log(respuestaConversionJson);
    console.log("Mi proceso de fetch terminó");
    return "Datos para el siguiente .then"
})
.then (mensaje => console.log(mensaje));
console.log("fin de mi js")