console.log("JS06 inicio de mi js");
console.log ("muchas instrucciones");

fetch("colors.json")
.then ( respuestaFetch => respuestaFetch.json() )
.then (respuestaConversionJson => {
    console.log (respuestaConversionJson);
    console.log("mi proceso de fetch termino");
    return "datos para el sig. .then";
})
.then (mensaje => console.log(mensaje));

/*console.log("JS06 leer JSON");

fetch("colors.json")
.then((response)=>response.json())
.then((data)=>{
    console.log(data);
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");
    tBody.innerHTML= "";

    for(let color of data.colors){
        console.log(color.color);
        tBody.innerHTML += `
        <tr>
        <td>${color.color}</td>
        <td>${color.category}</td>
        <td>${color.type ? color.type : "sin tipo"}</td>
        <td>${color.code.hex}</td>
        </tr>
        `;
    }
});*/