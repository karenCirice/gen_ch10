console.log("JS06 inicio de mi js");

fetch("colors.json")
.then (respuestaFetch => respuestaFetch.json())
.then (respuestaConversionJson => {
    console.log(respuestaConversionJson);
    console.log("Mi processo fetch terminó");
    return "datos para el sig. .then";
})
.then (mensaje => console.log(mensaje));