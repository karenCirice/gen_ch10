console.log("JS06 inicio de mi js");

console.log("Muchas instrucciones");


// FETCH ES UNA INSTRUCCIÓN ASÍNCRONA
fetch("colors.json")
.then((response)=> response.json())
.then((data) => {
    console.log(data);
    console.log("Instrucciones asíncronas")
    console.log(Array.isArray(data.colors));

    let tBody = document.getElementById("tBody");

 // // OPERADOR TERNARIO (?) SI ES TRUE --> SE CUMPLE LO QUE VA DESPUES DEL (?); SI ES FALSO ENTONCES SE CUMPLE LO QUE VA DESPUES DEL (:)
    for (let color of data.colors){
        console.log(color.code.hex);
        tBody.innerHTML += `
        <tr>
        <td>${color.color}</td>
        <td>${color.category}</td>
        <td>${color.type ? color.type: "Sin tipo"}</td>
        <td>${color.code.hex}</td>
      </tr>`;
    }
});

console.log("Fin de mi js");