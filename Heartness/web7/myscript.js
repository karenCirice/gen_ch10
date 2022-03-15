document.getElementById("demo").innerHTML = "My First JavaScript"

function myFunction(){
    document.getElementById("demo").style.color = "red";
    document.getElementById("demo").innerHTML = "Ahora el título es  ROJO";
    console.log("myFunction se ejecutó correctamente");
}

function myFunction2(element, color){
    element.style.color = color;
    console.log("Datos de this: ", element);
}

function myFunction3(){
    const collection = document.getElementsByClassName("color");
    
    for(let i = 0; i < collection.length; i++){
        collection[i].style.color = "blue";
    }

}