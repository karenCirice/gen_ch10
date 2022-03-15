function cambiaNombre(){
    let r, g, b;
    r= Math.floor((Math.random() * 255) + 1);
    g= Math.floor((Math.random() * 255) + 1);
    b= Math.floor((Math.random() * 255) + 1);
    let nombre = prompt("Cual es el nombre??");
    document.getElementById('newName').innerHTML = "<h1>Hola <span style='color: rgb("+r+", "+g+", "+b+")'>"+nombre+"</span>!! Bienvenido!</h1>";
    if( nombre == null || nombre == "")
    {
        cambiaNombre();
    }
}