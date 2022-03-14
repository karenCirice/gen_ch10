console.log("inicianco mi script");

function myFunction(){
    document.getElementById("demo").style.color ="red";
    console.log("cambiando color");
}

function myFunction2(element, color)
{
    console.log("Datos de this: ",element);
    element.style.color = color;
}
function cambiarColor(){
    const collection = document.getElementsByClassName('color');
    console.log(collection);

    for(element of collection)
    {
        element.style.color = 'blue';
    }
    //collection.style.color = 'blue';
}