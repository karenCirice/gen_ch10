console.log("JSON Leer JSON");

fetch("colors.json")
.then ((response) => response.json())
.then ((data) => {
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");

    for (let color of data.colors){
        console.log(color.color);
        tBody.innerHTML += `
            <tr>
            <td>${color.color}</td>
            <td>${color.category}</td>
            <td>${color.type}</td>
            <td>${color.code.hex}</td>
            <tr>
        `;
    }
});