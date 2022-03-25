console.log(iniciando mi script);
function myFunction(){
    document.getElementById("demo").style.color = "red";
    console.log(Cambiando el color);
}

function myFunction2(element, color){
    console.log("Datos de this; ",element);
   element.style.color = color;
}

function myFunction3(){
    const collection = document.getElementsByClassName ("color");
   console.log(collection);

   for(element of collection){
       element.style.color = "blue";
   }
   
   //collection[0].style.color = "blue";
   //collection[1].style.color = "blue";
}
