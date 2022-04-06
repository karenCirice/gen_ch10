fetch("colors.json")
    .then((response) => response.json())
    .then((data) => {
        console.log(data);
        console.log(Array.isArray(data.colors));

        let tbody = document.getElementById("tbody");
        tbody.innerHTML = "";
        for (let color of data.colors) {

            console.log(color.code.hex);
            tbody.innerHTML += `
        <tr>
          <td>${color.color}</td>
          <td>${color.category}</td>
          <td>${color.type ? color.type : "sin tipo"}</td>
          <td>${color.code.hex}</td>
        </tr>`;
        }
    });
