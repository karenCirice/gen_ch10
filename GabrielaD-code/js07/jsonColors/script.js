console.log("Sesión Js07: Leer JSON");
// alt + 96 = `
console.log("Iniciando JS");
/**
     * Función fetch que nos trae los datos asíncronos de color.json
     * @param {asinc} response es la respuesta de la página y lo transformamos a formato JSON para consumir los datos
     * @param {asinc} colors el arreglo que traemos de los usuarios de la página
     */
fetch("color.json")
    .then((response) => response.json())
    .then((data) => {
        console.log("Procesando datos JSON");
        // console.log(data);
        // console.log(Array.isArray(data.colors));

        let tBody = document.getElementById("tBody");
        tBody.innerHTML="";

        for (let color of data.colors) {
            console.log(color.color);
            //console.log(color.code.hex);
            tBody.innerHTML += `
            <tr>
            <td>${color.color}</td>
            <td>${color.category}</td>
            <td>${color.type ? color.type: "sintipo"}</td>
            <td>${color.code.rgba}</td>
            <td>${color.code.hex}</td>
            </tr>`;
        }
    });

    console.log("Terminando JS");

fetch("color.json")
.then(respuestaFetch => respuestaFetch.json())
.then(resConvJSON =>{
    console.log("Segundo then");
    console.log(resConvJSON);
    console.log("Mi proceso de fetch terminó");
    return "datos para el siguiente then";
});
console.log("Fin de JS");


