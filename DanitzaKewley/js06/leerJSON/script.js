console.log ("JSO6 inicio de mi js");

console.log("Muchas instrucciones");

/**
 * Fetch de documento colors.JSON 
 */
fetch("colors.json")
  .then((response) => response.json())
  .then((data) => {
    console.log("Instrucciones asincronas");
    //console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody")
    tBody.innerHTML = "";
    for (let color of data.colors){
      //console.log(color.color);
      tBody.innerHTML += `
        <tr>
        <td>${color.color}</td>
        <td>${color.category}</td>
        <td>${color.type ? color.type: "Sin tipo"}</td>
        <td>${color.code.hex}</td>
        </tr>`;
    }
  });

  console.log("Fin de mi JS");

