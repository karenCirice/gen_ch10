console.log("Jso6 inicio de mi js");
console.log("Muchas instrucciones");

fetch("colors.json")
.then ( respuestaFetch => respuestaFetch.json())
.then















/**
 * Este es el código bueno, Lo de arriba es el ejemplo de sintaxis y explicaciones para resolver dudas 
 * por tal motivo voy a comentar todo desde la linea 21
 */
/*console.log("Jso6 Leer Jason");

fetch ("colors.json") //fetch es una instrucción asíncrona
.then ((response) => response.json() )
.then ( (data) => {
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");
    tBody.innerHTML = "";



    for (let color of data.colors) {
        console.log(color.color);
        tBody.innerHTML += `
        
        <tr>
            <td>${color.color}</td>
            <td>${color.category}</td>
            <td>${color.type ? color.type : "Sin tipo"}</td>          <!--Esta es una instrucción con un ternario
            si solor.type es true entonces devuelve el valor, de lo contrario imprime sin tipo-->
            <td>${color.code.hex}</td>
          </tr>  `;
        
        
        
        
    }
} );
