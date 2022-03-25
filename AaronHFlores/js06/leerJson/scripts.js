console.log("Hola, conexion hecha");

fetch("colors.json")
    .then(respuestaFetch => respuestaFetch.json())
    .then(respuestaConversion => {
        console.log(respuestaConversion);
        console.log("Mi proceso fetch termino");
        return "datos para el sig .then";
    })
    .then(mensaje => console.log(mensaje));
    /* .then((response) => response.json())
    .then((data) => {
        console.log(data);

        let tBody = document.getElementById("tBody");

        for (const color of data.colors) {
            tBody.innerHTML += `
            <tr>
            <td>${color.color}</td>
            <td>${color.category}</td>
            <td>${color.type ? color.type : "Sin tipo"}</td>            
            <td>${color.code.rgba}</td>                 
            <td>${color.code.hex}</td>
            </tr>`;
        } 
    })*/