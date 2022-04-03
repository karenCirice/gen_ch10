fetch("colors.json")
.then ( respuestaFetch => respuestaFetch.json() )
.then ( respuestaConersionJson =>{
console.log(respuestaConversionJson);
console,log("Mi proceso de fetch termino");
return "datos para el sig. .then";
})
.then (mensaje => console.log(mensaje)); /*el return le paso el dato a mensaje*/