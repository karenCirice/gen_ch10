/*function myFunction(){
    document.getElementById("demo").style.color="red";
}

function myFunction2(element, color){
    element.style.color=color;
}

function myFunction3(){
    const collection = document.getElementsByClassName('color');
    console.log(collection);
    for(i=0; i<collection.length; i++){
        collection[i].style.color='blue';
    }
}*/
function myFunction(){
    let nombre = prompt("¿Cuál es tu nombre?");
    document.getElementById("demo").textContent="Hola "+nombre;    
}