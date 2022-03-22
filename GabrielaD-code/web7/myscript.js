document.getElementById("demo").innerHTML="...Que buenos memes...My fist JavaScript...";

function myFunction(){
    document.getElementById("demo").style.color="red";
}

function myFunction2(element,color){
    element.style.color=color;
}

function myFunction3(){
    const collection=document.getElementsByClassName("mycolor");
    // for(let i=0;i<collection.length;i++){
    //     collection[i].style.color="blue";
    // }
    for(e of collection){
        e.style.color="blue";
    }
    // for(let i = 0; i < collection.length; i++){
    //     collection[i].style.color = "blue";
    //     collection[i].style.backgroundColor = "orange";
    // }   

    // collection[0].style.color="blue";
    // collection[2].style.color="blue";
}