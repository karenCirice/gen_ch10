document.getElementById("dato").innerHTML="Qué buenos memes"
function myFunction(){
    document.getElementById("demo").style.color="red";
}

function myFunction2(element, color){
    console.log("Esto contiene el this: ",element);
    element.style.color=color;
}

function myFunction3(){
    const collection=document.getElementsByClassName("example");
    console.log(collection);
    for(let i=0; i<collection.length; i++){
        collection[i].style.color="blue";
    }
}