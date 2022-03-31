console.log("Hola Mundo");
fetch("colors.json")
    .then( (response)=>{
        return response.json()
    })
    .then( (data)=>{
        let tbody = document.querySelector("#tBody");
        tbody.innerHTML = "";
        for(let color of data.colors){
            tbody.innerHTML += `
                <tr>
                    <td>${color.color}</td>
                    <td>${color.category}</td>
                    <td>${color.type ? color.type : "Sin tipo"}</td>
                    <td>${color.code.hex}</td>
                </tr>
            `
        }
    })