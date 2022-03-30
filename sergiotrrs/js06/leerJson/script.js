console.log("JS06 incio de mi js");
console.log("Muchas instrucciones");

/* let funcionFlechaMultiplica = (a,b) => a*b;
let imprimir = funcionFlechaMultiplica(5,6);
console.log(imprimir); */

/* let respuestaFetchSincrono = fetch ("colors.json");
let respuestaConversionJson = respuestaFetchSincrono.json(); */

//let timeout;
/* function imprimirMsj(){
  console.log("mensaje imprimir");
}

function myFunction(){
  console.log("inicio de myFuction");
  setTimeout( imprimirMsj, 3000);
  console.log("fin de myFuction");
}

myFunction(); */


//fetch ("hola.txt").then(a => a.text()).then(b=> console.log(b));

/* fetch("colors.json")
  .then ( respuestaFetch => respuestaFetch.json() )
  .then ( respuestaConversionJson => {
    console.log(respuestaConversionJson);
    console.log("Mi proceso de fetch terminó");
    return "datos para el sig. .then";
  })
  .then ( mensaje => console.log(mensaje));

console.log("Fin de mi js"); */

  //.then((response) => response.json())
/*   .then((data) => {
    console.log("Instrucciones asíncronas");
    //console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");
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
  }); */

