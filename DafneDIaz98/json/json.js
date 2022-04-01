function traer(){
    
    fetch("colors.json")
    .then((response) => 
        response.json()
    )

    .then(data=>
        tabla(data)
    )
}


function tabla(data){
    
    let contenido = document.getElementById("contenido");

    for(let valor of data.colors){
        
        contenido.innerHTML += `
        <tr>
            <th scope="row">${valor.color}</th>
            <td>${valor.category}</td>
            <td>${valor.type ? valor.type : "Sin tipo"}</td>
            <td>${valor.code.rgba}</td>
            <td>${valor.code.hex}</td>
        </tr>
        `
    }
}

//Script 

fetch("colors.json")
.then(respuesta => respuesta.json())
.then(datos =>{
    console.log(datos);
    console.log(`proceso fetch termino`);
    return "finalizando con exito";
})
.then(mensaje => console.log(mensaje))