/*function myFunction(){
   let sinnombre =document.getElementById("nombre").style.color="red";
   result = window.prompt("Me escribes tu nombre?", default);
   sinnombre.innerHTML = "Saludos " + result;
}*/



function myFunction2(element,color){
    console.log("Datos de this:",element);
    element.style.color = color;
}


function myFunction() {
    let h1_nombre = document.getElementById('nombre');
    let nombre = window.prompt("¿Cuál es tu nombre?");
    h1_nombre.innerHTML = "Hola " + nombre;
}



function myFunction3(){
    const collection= document.getElementsByClassName('color');
    console.log(collection);

    collection[0].style.color ="blue";
    collection[1].style.color ="blue";

}