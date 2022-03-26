console.log("JS06 inicio de mi js");
console.log("Muchas instrucciones");

// OPCION ASINCRONA
// let funcionFlechaMultiplica = (a*b) => a*b;
// let imprimir = funcionFlechaMultiplica(5,6);
// console.log(imprimir);

// let respuestaFetchSincrono= fetch("colores.json");
// let respuestaConversionJson= respuestaFetchSincrono.json();

fetch("colors.json")
.then (respuestaFetch => respuestaFetch.json())
.then (respuestaConversionJson => {
  console.log(respuestaConversionJson);
  console.log("Mi proceso fetch terminó");
  return "datos para el sig. .then";
})
.then (mensaje => console.log(mensaje));

console.log("Fin de mi js");

// FETCH ES UNA INSTRUCCIÓN ASÍNCRONA
fetch("colors.json")
.then((response)=> response.json())
.then((data) => {
    console.log(data);
    console.log("Instrucciones asíncronas")
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");

 // // OPERADOR TERNARIO (?) SI ES TRUE --> SE CUMPLE LO QUE VA DESPUES DEL (?); SI ES FALSO ENTONCES SE CUMPLE LO QUE VA DESPUES DEL (:)
    for (let color of data.colors){
        console.log(color.code.hex);
        tBody.innerHTML += `
        <tr>
        <td>${color.color}</td>
        <td>${color.category}</td>
        <td>${color.type ? color.type: "Sin tipo"}</td>
        <td>${color.code.hex}</td>
      </tr>`;
    }
});

console.log("Fin de mi js");
