console.log("JS06 Leer JSON");

/**Fetch significa como ir a buscar, traer o extraer
 * Fetch es el nombre de una nueva API para javascript con la cuál podemos realizar peticiones 
 * HTTP.
 * Fetch API provee una interfaz para acceder y manipular partes del HTTP pipeline, como puede ser peticiones (request)
 * y respuestas. En este ejemmplo de extrae el contenido del archivo json interno del equipo
 */
fetch("colors.json")
  .then((response) => response.json())
  .then((data) => {
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");
    tBody.innerHTML=""
    for (let color of data.colors) {
      console.log(color.code.hex);
      tBody.innerHTML += `
    <tr>
    <td>${color.color} </td>
    <td>${color.category}</td>
    <td>${color.type ? color.type: "Sin tipo"}</td>
    <td>${color.code.hex}</td>
    </tr>
    `;
    }
  })

