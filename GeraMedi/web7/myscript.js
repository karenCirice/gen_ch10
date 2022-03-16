function myFunction(){
    document.getElementById("demo").style.color = "red";
}
//me regresa todo el objeto (h2 en este caso y me cambia el color)
function myFunction2(element, color){
	element.style.color = color;
}
//En esta función ya se realza con la clase, agarre todas las etiquetas tienen la clase color.
//La función de abajo se necesita repetir por cada etiqueta, por lo que se debe realizar un for
//para que lo realice hasta tener todo en el color que se desea.
function myFunction3(){
    const collection = document.getElementsByClassName("color");
    //le pusimos el color manuelmente, pero es más fácil hacerlo con el for.
    collection[0].style.color = "blue";
    collection[1].style.color = "blue";
    collection[2].style.color = "blue";
}

/*function myFunction3(){
    const collection = document.getElementsByClassName("color");
    console.log(collection);
    //Ejemplo del for
        for(element of collection){
            element.style.color = "blue"
        }
}*/