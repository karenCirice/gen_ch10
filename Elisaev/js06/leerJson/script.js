console.log("elementos sincronos:");
console.log("JS06 Leer Json");


// llamar al archivo json 
// se pone sin ;
fetch("colors.json")
    .then((response) => response.json())
    .then((data) => {
        //dentro de { si se usa ;}
        console.log(data);
        console.log(Array.isArray(data.colors));

        let tBody = document.getElementById('tBody');
        tBody.innerHTML = "";

        // va iterando cada valor de la clave del archivo json.
        for (let color of data.colors) {
            console.log(color.color);
            tBody.innerHTML +=

                // si el color.type es vedadero , se va ejecutar el valor (despues del ?) , si es falso se va ejecutar el string (despues de :)
                `
            <tr>
            <td>${color.color}</td>
            <td>${color.category}</td>
            <td>${color.type ? color.type : "Sin tipo"}</td>
            <td>${color.code.hex}</td>
            `;
        }
    });


// fetch("colors.json")

//     .then(response => response.json())
//     .then(data => {
//         console.log(data); 
//         console.log("elementos asincronos dentro del fetch:")
//         console.log("Mi proceso de fetch termino");
//         return "datos para el sig .then";
//     }) // continua con otro proceso .then

//     .then (mensaje => console.log(mensaje));

// console.log("Fin de js");