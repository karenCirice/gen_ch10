

function myfunction(){
    document.getElementById("demo_1").style.color="red";
}

function myfunction_1(element,color){
    console.log("Datos de this:",element);
    element.style.color = color;
}

function myfunction_2(){
    const collection=document.getElementsByClassName("color");
    console.log(collection);

    collection[0].style.color="blue";
    collection[1].style.color="green";
}