console.log("JS06 Leer JSON");

console.log("Muchas instrucciones");

let timeout;

function imprimirMsj(){
    console.log("Mensaje que se imprimira");
}

function myFunction(){
    timeout= setTimeout(imprimirMsj, 3000);
}

myFunction();

fetch("colors.json")
.then ((ResultadoDelFetch) => ResultadoDelFetch.json())
.then ((ResultadoDeLaConversionJson) => {
    console.log(ResultadoDeLaConversionJson);
    console.log(" El proceso del Fetch termino")
    //console.log(data);
    return "Datos que se encontraran en el siguiente .then"
})

//.then (mensaje =>  console.log(mensaje));

console.log("Termina el JSON")

/*
    let tBody = document.getElementById("tBody");
    tBody.innerHTML="";

    for (let color of data.colors){
        console.log(color.color);
        //console.log(color.code.hex);
        tBody.innerHTML += `
        <tr>
        <th> ${color.color} </th>
        <td> ${color.category} </td>
        <td> ${color.type ? color.type: "Sin tipo "} </td>
        <td> ${color.code.hex} </td>
        <td> ${color.code.rgba}</td>
        </tr>
      `;
    }
});

console.log("Fin de mi JS");

*/