console.log(" JS06 Leer JSON");

fetch ("colors.json")
.then ((response) => response.json())
.then ((data) => {
    console.log(data);
    console.log( Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");

    for (let valor of data.colors ) {
        console.log(valor.color);
        tBody.innerHTML += `
            <tr>
                <th scope="row">${valor.color}</th>
                <td>${valor.category}</td>
                <td>${valor.type ? valor.type : "Sin tipo"}</td>
                <td>${valor.code.rgba}</td>
                <td>${valor.code.hex}</td>
            </tr>
            `;
    }
});