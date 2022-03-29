console.log("js06")

fetch("colors.json")
.then((response) => response.json())
.then((data)=> {
    console.log(data);
    console.log(Array.isArray(data.colors));
    console.log("que chingados");
   
    


    let tBody = document.getElementById("tBody");
    tBody.innerHTML = " ";
    
    for (let color of data.colors){
        console.log(color.color);
        tBody.innerHTML += `
        <tr>
        <th> ${color.color}</th>
        <td>${color.category}</td>
        <td>${color.type}</td>
        <td>${color.code}</td>
      </tr>
        `;

    }
    
});

