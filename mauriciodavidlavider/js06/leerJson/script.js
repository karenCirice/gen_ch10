
/**
 * En este programa imprimimos elementos en una tabla dinamica
 */

console.log("JS06 Leer JSON");

fetch ("colors.json")
.then ((response) => response.json())
.then ((data) => {
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");

    for(let color of data.colors){
        console.log(color.color);
        console.log(color.code.hex);
        tBody.innerHTML += `
            <tr>
            <td>${color.color}</td>
            <td>${color.category}</td>
            <td>${color.type ? color.type : "Sin tipo"}</td>
            <td>${color.code.hex}</td>
            </tr>
        `;
    }
})