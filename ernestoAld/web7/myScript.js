

/* 
setTimeout(function(){
    document.getElementById("demo").innerHTML = "Titulo modificado";
}, 1000);

console.log("setTimeout() Ejemplo..."); */

function cambiarColor(){
    document.body.style.backgroundColor = "#ccc";
    document.getElementById("demo").style.color = "red";
    setTimeout(function(){
        document.getElementById("demo").innerHTML = "Titulo modificado";
    }, 1000);
}

function cambiarElemento(elemento,color){
    console.log("Informacion del elemento: \t\n"+this);
    elemento.style.color = color;
}


function cambiarParrafos(){
    const collection = document.getElementsByClassName('parrafoColor');
    for(let i = 0; i < collection.length; i++){
        collection[i].style.color = "blue";
        collection[i].style.backgroundColor = "orange";
    }     
}


/* 
setTimeout(function(){
    for(let i = 0; i < collection.length; i++){
        collection[i].style.color = "blue";
        collection[i].style.backgroundColor = "orange";
    }    
}, 1000); */

function cambiarFondo(){
    document.body.style.backgroundColor = "red";
}