function traer(){
    
    fetch("colors.json")
    .then((response) => 
        response.json()
    )

    .then(data=>
        tabla(data)
    )
}

/**
 * 
 * @param {Object} data dato Object que contiene un JSON para iterar sobre su contenido
 *  
 */


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