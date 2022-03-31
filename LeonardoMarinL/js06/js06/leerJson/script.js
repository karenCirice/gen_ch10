console.log("JS06 leer json");
console.log("muchas instrucciones");

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

  /*let timeOut;

  function imprimirMsj(){
    console.log("mensaje a imprimir");
  }

  function myFunction(){
    timeOut = setTimeout(imprimirMsj,3000);
  }

  myFunction();

  fetch ("colors.json")
  .then (respuestaFetch => respuestaFetch.json())
  .then (respuestaConversionJson => {
    console.log(respuestaConversionJson);
    console.log("Mi proceso json terminó");
    return "datos para el sig. .then";
  })
  .then (mensaje => console.log(mensaje));

  console.log("fin de mi js");*/