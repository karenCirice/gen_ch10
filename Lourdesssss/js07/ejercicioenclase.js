console.log("inicio de mi js");
console.log("Muchas instrucciones");

fetch("https://reqres.in/api/users?page=1")
    .then(respuestaFetch => respuestaFetch.json())
    .then(respuestaConversionJson => {
        console.log(respuestaConversionJson)
        console.log("mi proceso de fetch terminó")
        return "datos para el sig. .then"
    })
.then (mensaje => console.log(mensaje));

console.log("fin de mi js");
