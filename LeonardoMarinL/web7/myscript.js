function myFunction(){
    let h1_nombre = document.getElementById("nombre");
    let name = window.prompt("¿Cuál es tu nombre?");
    h1_nombre.innerHTML = "Hola " + name;
    document.getElementById("nombre").style.color="#2d6a4f";
    //document.getElementById("name").style.color= "green";
}