const body = document.querySelector("body");

function obtenerFormulario(){
    let nombre = document.querySelector('#nombre').value;
    let apellido = document.querySelector("#apellido").value;
    console.log(nombre, apellido);
    localStorage.setItem("nombreUser", nombre);
    localStorage.setItem("apellidoUser", apellido);

    document.querySelector('#nombre').value = "";
    document.querySelector("#apellido").value = "";

}
function recuperarDatos(){
    const resultado = document.createElement('p');
    resultado.classList.add('resultado');
    resultado.textContent = `${localStorage.getItem("nombreUser")} ${localStorage.getItem("apellidoUser")}`;
    body.appendChild(resultado);
}
function esconderFormulario(){
    document.getElementById("formulario").style.visibility = "hidden";
}

function invisibleFormulario(){
    document.getElementById("formulario").style.display = "none";
}

function mostrarFormulario(){
    document.getElementById("formulario").style.visibility = "visible";
    document.getElementById("formulario").style.display = "";
}


