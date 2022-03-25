console.log("JS06 Leer JSON");

console.log("Muchas instrucciones");

fetch("colors.json")
.then ((response) => response.json())
.then ((data) => {
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");
    tBody.innerHTML="";

    for (let color of data.colors){
        console.log(color.color);
        //console.log(color.code.hex);
        tBody.innerHTML += `
        <tr>
        <th> ${color.color} </th>
        <td> ${color.category} </td>
        <td> ${color.type ? color.type: "Sin tipo "} </td>
        <td> ${color.code.hex} </td>
        <td> ${color.code.rgba}</td>
        </tr>
      `;
    }
});

console.log("Fin de mi JS");