console.log("JS06 LeerJason");

fetch("colors.json")
  .then((response) => response.json())
  .then((data) => {
    console.log(data);

    let tBody = document.getElementById("tBody");

    for (let color of data.colors) {
      console.log(color.color);
      tBody.innerHTML += `
      <tr> 
      <td>${color.color}</td>
        <td>${color.category}</td>
        <td>${color.type ? color.type : "Sin tipo"}</td>
        <td>${color.code.rgba}</td>
        </tr>
        `;
    }
  });
