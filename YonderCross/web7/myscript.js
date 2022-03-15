function myFunction (){
    document.getElementById("demo").style.color = "#960a5b";
    let nombre = prompt("¿Cual es tu nombre?");
    document.getElementById("demo").innerHTML = "¡Hola " + nombre + "!";
}

function myFunction2(element, color){
    console.log("datos de this: ",element)
    element.style.color = color;
}

function myFunction3(){
    const collection = document.getElementsByClassName ('color');
    console.log(collection);

    collection[0].style.color = 'navy';
    collection[1].style.color = 'navy';
}