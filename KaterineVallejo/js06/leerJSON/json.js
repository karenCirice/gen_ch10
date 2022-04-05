console.log("JS06 LEER JSON");
console.log("Muchas isntrucciones")

fetch("colors.json")
.then (respuestaFetch => respuestaFetch.json())
.then (respuestaConversionJson =>{
    console.log(respuestaConversionJson);
    console.log("Mi proceso de fetch termino");
    return "datospara el siguiente .then";
})
.then (mensaje => console.log(mensaje));
console.log ("Fin de mi js");

/*fetch("colors.json")

    .then((response) => response.json())
    .then((data) => {
        console.log(data);
        console.log(Array.isArray(data.colors));

        let tBody = document.getElementById("tBody");
        
        for (let color of data.colors) {
            console.log(color.color);
            tBody.innerHTML += `
        <tr>
        <td>${color.color}</td>
        <td>${color.category}</td>
        <td>${color.type ? color.type : "Sin tipo"}</td>
        <td>${color.code.hex}</td>
      </tr> `;

        }
    });*/
