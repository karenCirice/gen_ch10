console.log("JS06 leer json");

function obtener(){
fetch("colors.json")
  .then((response) => response.json())
  .then(data => tabla(data))
}

function tabla(data){
    let tBody = document.getElementById("tBody");

    for (let color of data.colors) {
      //console.log(color.color);
      tBody.innerHTML += `
        <tr>
            <td>${color.color}</td>
            <td>${color.category}</td>
            <td>${color.type ? color.type:"Sin tipo"}</td>
            <td>${color.code.rgba}</td>
            <td>${color.code.hex}</td>            
        </tr>`;
    }
  }

  function limpiar(){
      tBody.innerHTML = ``;
  }
