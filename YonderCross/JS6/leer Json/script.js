console.log("Leer Json");

/* fetch("micolor.json")
    .then ( respuestaFetch => respuestaFetch.json() )
    .then ( respuestaConversionJson => {
        console.log(respuestaConversionJson);
        console.log("Mi proceso de fetch terminó");
        return "datos para el sig. .then";
    })
    .then ( mensaje => console.log(mensaje));

console.log("Fin de mi js"); */

fetch ("micolor.json")
    .then ((response) => response.json())
    .then ((data) =>{
        console.log(data);
        console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");
    tBody.innerHTML = "";

    for(let color of data.colors){
        console.log(color.color);
        tBody.innerHTML += `
        <tr>
        <td>${color.color}</td>
        <td>${color.category}</td>
        <td>${color.Type ? visualViewport.type: "sin tipo"}</td>
        <td>${color.code}</td>
        </tr>` ;


    }
});

