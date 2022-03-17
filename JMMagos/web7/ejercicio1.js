function saludo(){
    const nombre=document.getElementsByClassName("btn btn-primary");
    let nombreUsuario=prompt("¿cuál es tu nombre?");
    document.getElementById("cambio").textContent="Hola "+nombreUsuario;
}