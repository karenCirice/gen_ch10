console.log("JSON6")

fetch("colors.json")
.then ((Response) => Response.json())
.then ((data) =>{
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");

    for (let color of data.colors){
        console.log(color.code.hex);
        tBody.innerHTML +=`

        <tr>
            <th>${color.color}</th>
            <td>${color.category}</td>
            <td>${color.type ? color.type :"Sin tipo"}</td>
            <td>${color.code.hex}</td>
          </tr>
          `}
} );