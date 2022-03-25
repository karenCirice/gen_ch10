console.log("JS06 inicio de mi js");
console.log("Muchas instrucciones");

fetch("colors.json")
.then (respuestaFetch => respuestaFetch.json() )
.then (respuestaConversionJson => {
    console.log(respuestaConversionJson);
    console.log("mi proceso de fetch terminó");
    return "datos para el sig .then";
})
.then (mensaje => console.log(mensaje));
console.log("Fin de mi js");