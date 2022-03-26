console.log("js06 inicio de mi js");
console.log("Muchas instrucciones");




fetch("color.json")
.then (respuestaFetch => respuestaFetch.json())
.then (respuestaConversionJson => {
console.log(respuestaConversionJson);
console.log("Mi proceso de fetch termino");
return "datos para el sig. .then";
})
.then (mensaje => console.log(mensaje));
console.log("fin de mi js");

