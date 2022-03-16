console.log("Iniciando mi script");

function myFunction() {
    document.getElementById("demo").style.color = "red";
    console.log("Cambiando el color");
}
// Aqui llega todo el elemento h2 y desde aqui se puede modificar
function myFunction2(element, color) {
    console.log("Datos de this: ", element);
    element.style.color = color;
}

function myFunction3() {
    const collection = document.getElementsByClassName('color');
    
    // for (let index = 0; index < collection.length; index++) {
    //     collection[index].style.color = "blue";       
    // }

    for (element of collection) {
        element.style.color = "blue";
    }
}