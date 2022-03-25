console.log("JS Funcionando.")

fetch("colores.json")
.then ((response) => response.son())
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