// fetch ("colors.json")
// .then ((response) => response.json())
// .then ((data) => {
//     console.log(data);
//     console.log(Array.isArray(data.colors));
//     let tBody = document.getElementById("tBody");

//     for (let color of data.colors){
//         console.log(color.color);
//         tBody.innerHTML += ` 
//         <tr>
//         <td>${color.color}</td>
//         <td>${color.category}</td>
//         <td>${color.type ? color.type : "Sin tipo"}</td>
//         <td>${color.code.rgba}</td>
//         <td>${color.code.hex}</td>
//         </tr>`;
//     }
// });
let TiemOut;

function imprimirMensaje() { 
    console.log("Mensaje a imprimir");
}
function myFuntion() {
    TiemOut = setTimeout(imprimirMensaje, 3000);
}

myFuntion();

fetch("colors.json")
    .then(respuestaFetch => respuestaFetch.json())
    .then( respuestaConversionJson => {
        console.log(respuestaConversionJson);
        console.log("Mi proceso de fetch termino");
        return "datos para el sig. .then";
 })
    .then( mensaje => console.log(mensaje));

console.log("fin de js");