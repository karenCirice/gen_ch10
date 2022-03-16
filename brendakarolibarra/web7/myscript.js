
function myFunction(){
 document.getElementById("demo").style.color="red";
console.log("Cambiando el color");
}

function myFunction2(element,color){
    element.style.color=color;
}

function myFunction3(){
    const collection=document.getElementsByClassName("color");
    console.log(collection);
    collection[0].style.color="blue";
    collection[1].style.color="blue";
}