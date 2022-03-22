function myFunction() {
    let newName = prompt("Cual es tu nombre");
    document.getElementById("name").innerHTML = "Hola"+newName;
    document.getElementById("name").style.color="purple";
}
