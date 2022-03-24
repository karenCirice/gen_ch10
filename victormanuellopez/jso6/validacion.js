function obtenerform(colorfondo){
    colorfondo = "blue";
    let form = document.forms["form"];
    //console.log(form);
    let sum = "";
    for (let i of form){
        //console.log(i += ",");
        sum = sum + " " + i.value;
    }
    console.log(sum);
    console.log(form.nombre.value);
    console.log(form.apellido.value);
    localStorage.setItem(form["nombre"]["name"],form["nombre"]["value"]);
    localStorage.setItem(form["apellido"]["name"],form["apellido"]["value"]);
}

function recuperarform(){
    let form = document.forms["form"];
    document.getElementById("nomb").value = localStorage.getItem(form["nombre"]["name"]);
    document.getElementById("apell").value = localStorage.getItem(form["apellido"]["name"]);
    console.log("Datos en memoria es: ", localStorage.getItem(form["nombre"]["name"]));
    form["nombre"]["value"] == localStorage.getItem(form["nombre"]["name"]);
    form["apellido"]["value"] == localStorage.getItem(form["apellido"]["name"]);
}

function setinvisible(){
    let boton = document.getElementById("todos");
    boton.style.visibility="hidden";
}

function setocultar(){
    let boton = document.getElementById("todos");
    boton.style.display="none";
}