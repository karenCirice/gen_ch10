console.log("js06 Leer JSON")
 
fetch ("colors.json")
.then ((response) => response.json()) /*para parsear el archovo a un archivo JSON se usa response.json(), cuando es una instruccion no se ponen {}*/
.then((data) => { /*se puso data funcion flecha*/
console.log(data);
console.log(Array.isArray(data.colors));
for (let color of data.colors){
    console.log(color.code.hex); /*otra forma es color.code.hex*/

    let tBody= document.getElementById("tBody");
    tBody.innerHTML ="";
    for (let color of data.colors){
 console.log(color.color);
 /* para agregar la tabla, usar acento grave `,
  se uso una funcion terniaria en colo.type para evaluar si lo que es tru ses ejecuta lo primero,
  pero : si no es asi se ejecuta lo otro. 
  Se puso =+ despues de tBody.innerHTML para poner todos los colores*/
 tBody.innerHTML += `

            <tr>
            <td>${color.color}</td>
            <td>${color.category}</td>
            <td>${color.type ? color.type: "Sin tipo"}</td> 
            <td>${color.code.hex}</td>
            </tr> `;
    }
   
}
} );

console.log("Fin de mi JSON")