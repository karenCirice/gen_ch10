console.log("JS Funcionando.")

fetch("colors.json")
.then ((response) => response.json())
.then ((data) => {
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");
    tBody.innerHTML = "";
    for(let color of data.colors){
        console.log(color.color);
        tBody.innerHTML += `
        <tr>
        <td>${color.color}</td>
        <td>${color.category}</td>
        <td>${color.type ? color.type : "Sin Tipo"}</td>
        <td>${color.code.hex}</td>
        </tr>`;
    }
});

fetch("colors.json")
.then(respuesta => respuesta.json)
.then(respuestaConv =>{
    console.log(respuestaConv);
    console.log("Mi proceso Terminó");
    return "Datos para el siguiente .then"
})
.then(mensaje => console.log(mensaje));