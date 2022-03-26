console.log("JS06 incio de mi js");

console.log("Muchas instrucciones");

fetch("colors.json")
  .then(respuestaFetch => respuestaFetch.json())
  .then(respuestaConversionJson => {
    console.log(respuestaConversionJson);
    console.log("Mi proceso de fetch terminó");
    return "datos para el siguiente .then";
  })
  .then (mensaje => console.log(mensaje))
    
  
  
  //console.log(Array.isArray(data.colors));

    /*let tBody = document.getElementById("tBody");
    tBody.innerHTML = "";
    for (let color of data.colors) {
      //console.log(color.color);
      tBody.innerHTML += `
        <tr>
        <td>${color.color}</td>
        <td>${color.category}</td>
        <td>${color.type ? color.type : "Sin tipo"}</td>
        <td>${color.code.hex}</td>
        </tr> `;
    }
  });*/
  
  console.log("Fin de mi js");