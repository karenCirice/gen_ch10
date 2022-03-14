console.log("Iniciando script");

function myFunction (){
    let nombre = prompt("Escriba su nombre");
    console.log("Hola " +nombre+ "!");
    myFunction2(nombre);
}

function myFunction2(nombre){
    document.getElementById("demo").innerHTML = "¡Hola " + nombre + "!";

    alert("¡Hola " +nombre);
}


