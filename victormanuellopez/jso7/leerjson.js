fetch("colors.json")
.then((response) => response.json())
.then((data) =>{
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tbody = document.getElementById("tbody");
    for (let color of data.colors){
        //console.log(color.color);
        tbody.innerHTML += `
        <tr>
          <td>${color.color}</td>
          <td>${color.category}</td>
          <td>${color.type ? color.type : "Sin tipo"}</td>
          <td><img>${color.code.hex}</td>
        </tr>`;
    }
});
