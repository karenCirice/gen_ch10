fetch("colors.json")
.then((response) => response.json())
/*
.then(respuesta =>{
  console.log(respuesta);
  console.log("Mi proceso de fetch termino");
  return "datos para el sig. .then";
})
.then(mensaje => console.log(mensaje))
*/

.then((data) =>{
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tbody = document.getElementById("tbody");
    for (let color of data.colors){
        //console.log(color.color);
        tbody.innerHTML += `
        <tr>
          <td>${color.color}</td>
          <td>${color.category}</td>
          <td>${color.type ? color.type : "Sin tipo"}</td>
          <td><img>${color.code.hex}</td>
        </tr>`;
    }
});
