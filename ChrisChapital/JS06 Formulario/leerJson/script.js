console.log ("JS06 Leer JSON");

fetch ("colors.json")
  .then ((respuesta) => respuestaFetch.txt())
  .then ((respuestaConversasionJson) => {
    console.log(respuestaConversasionJson);
    console.log("Mi proceso de fetch terminó");
    return "datos para el sig. .then";
  })
  .then ( mensaje => console.log(mensaje));

  console.log("Fin de mi js");

    let tBody = document.getElementById("tBody");
    tBody.innerHTML = "";
    for (let color of data.color){
        console.log(color.color);
        tBody.innerHTML = `
        <tr>
        <td>${color.color}</td>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
      </tr>`;

    }
});