console.log("Js06 Leer JSON");
//console.log("Mas instrucciones");

fetch("colors.json")
.then (response => response.json())
.then (data => {
    console.log(data);
/**    console.log("Mi proceso fecth termino");
    return "datos para el siguiente .then";
})
.then (mensaje => console.log(mensaje));
console.log("Fin de mi json");
*/

console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");
    tBody.innerHTML = "";
    for (let color of data.colors){
        console.log(color.color);
        tBody.innerHTML += `
            <tr>
            <td>${color.color}</td>
            <td>${color.category}</td>
            <td>${color.type}</td>
            <td>${color.code.hex}</td>
            <tr> `;
    }
});