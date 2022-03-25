console.log("Script JS06 Leer Json");

// let fetchSincrono = fetch("colors.json");
// let respuestaConversion= fetchSincrono.then(response => response.json());
// let respuestaFinal = respuestaConversion.then(response => response);
// console.log(respuestaFinal);


// cada then trabaja con el retorno de la función anterior
// es decir, en el sig ejemplo el primer then trabaja en el
// retorno directo de fetch, el segundo then trabaja con lo
// obtenido del primer then y así sucesivamente, aunque no se
// encuentre especificamente explicito
fetch("colors.json")
  .then(respuestaFetch => respuestaFetch.json())
  .then(respuestaConversion => {
    console.log(respuestaConversion);
    console.log("Mi proceso de Fetch terminó");
    return "datos para el sig then";
  })
  .then((data) => console.log(data));

// fetch trabaja de forma asíncrona
// fetch("colors.json")
//   .then((response) => response.json())
//   .then((data) => {
//     console.log(data);

//     let tbody = document.getElementById("tbody");
//     tbody.innerHTML = "";

//     for (const color of data.colors) {
//       console.log("Instrucciones asincronas");
//       console.log(color.color);

//       // Para que nos salga la tabla completa hay que concatenar cada fila
//       // de lo contrario solo nos mostrará la última fila registrada en el for
//       tbody.innerHTML += `
//         <tr>
//             <td>${color.color}</td>
//             <td>${color.category}</td>
//             <td>${color.type ? color.type : "Sin tipo"}</td>
//             <td>${color.code.hex}</td>
//         </tr>
//         `;
//     }
//   });

console.log("Fin de mi Script");
