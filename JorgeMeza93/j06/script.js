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


// function recuperarDatos(){
//     let nombre = document.getElementById("nombre-input");
//     let apellido = document.getElementById("apellido-input");
//     document.getElementById("resultado").value = `${localStorage.getItem(nombre.name)} ${localStorage.getItem(apellido.name)}`;
    
// }

