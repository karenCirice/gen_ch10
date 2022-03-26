console.log("js06 leer json");
console.log("Muchas instrucciones");


fetch("colors.json")
    .then((response) => response.json())
    .then((data) => {
        console.log("Instrucciones Ascincronas");
        //console.log(data);
        //console.log(Array.isArray(data.colors));

        let tBody = document.getElementById("tBody");
        tBody.innerHTML = "";
        for (let color of data.colors) {
            console.log(color.code.hex)
            tBody.innerHTML += `
            <tr>
                <th>${color.color}</th>
                <td>${color.category}</td>
                <!-- <td>${color.code.hex}</td> -->
                <td>${color.type ? color.type : "Si n tipo"}</td>
                <td>${color.code.hex}</td>
                <td>${color.code.rgba}</td>
            </tr>
        `;
        }

    });

    console.log("Fin de mi JS");
    
/* 
    function imprimirMsj(){
        console.log("Mensaje imprimir");
    }

    let timeOut;
    function myFunction(){
        timeOut = setTimeout(imprimirMsj, 5000);

    }

    myFunction();


fetch("colors.json")
    .then((respuestaFetch) => respuestaFetch.json())
    .then((respuestaConversionJson) => {
        console.log(respuestaConversionJson);
        console.log("Mi respuesta de fetch termino");
        return "datos para el siguiente then";
    })

    .then((mensaje) => console.log(mensaje));

console.log("Fin de mi JS");
 */