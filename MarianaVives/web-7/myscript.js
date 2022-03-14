
function myFunction(){
    let name = document.getElementById('id_name')
    let id_name= window.prompt ("¿Cuál es tu nombre?")
    name.innerHTML= "Hola " + id_name;
}

// // Primera forma de cambiar el color usando "botones"
// function myFunction(){
//     document.getElementById("demo").innerHTML=('nombre');
//     console.log("cambiando el nombre");
// }

// Segunda forma de cambiar el color del texto "sin boton"
function myFunction2(element,color){
    console.log("datos de this: ", element);
element.style.color= color;
}

// Tercera forma de cambiar el color del Texto con usando clases
function myFunction3(){
    const collection= document.getElementsByClassName('color');
    console.log(collection);

// // Para cambiar texto a azul con un for: (**ERNESTO ME DIO EL TIP**)
//     function cambiarParrafos(){
//     const collection = document.getElementsByClassName('parrafoColor');
//     for(let i = 0; i < collection.length; i++){
//         collection[i].style.color = "blue";
//     }   
// }

//  Para cambiar textos a azul uno por uno   
collection[0].style.color ='blue';
collection[1].style.color ='blue';

}