//Ejercicio 5
const people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

function arrTareas(array) {
    console.log("- Imprime el arreglo en forma de lista")
    for (let i = 0; i < array.length; i++) {
        console.log(i+".- "+array[i]);
    }
    console.log("- Quitar a Dani");
    array.splice(1, 1);
    console.log(array);
    console.log("- Quitar a Juan");
    array.splice(2, 1);
    console.log(array);
    console.log("- Agregar a Luis")
    array.splice(1, 1);
    array.unshift("Luis");
    console.log(array);
    console.log("- Agregar mi nombre");
    array.push("Eduardo");
    console.log(array);
    console.log("Encontrar a Maria y terminar el ciclo");
    for (let j = 0; j < array.length; j++) 
    {
        if(array[j] == "Maria"){
            console.log(j+".- "+array[j]);
            break
        }
        else{
            console.log(j+".- "+array[j]);
        }
    }
    console.log("- Posicion de Maria");
    let indice = array.indexOf("Maria");
    console.log("Maria se encuentra en la posicion: "+indice);
}

arrTareas(people);
