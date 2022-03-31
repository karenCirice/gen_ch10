
let calcularFecha = ()=>{
    let fecha = new Date(parseInt(document.getElementById("anio").value),parseInt(document.getElementById("mes").value)-1,parseInt(document.getElementById("dia").value));
    definirFecha(fecha.getDay());
}

function definirFecha(dia){

    switch (dia) {
        case 0:
            document.getElementById("weekday").value = "Lunes es día laborable";
            break;
        case 1:
            document.getElementById("weekday").value = "Martes es día laborable";
            break;
        case 2:
            document.getElementById("weekday").value = "Miércoles es día laborable";
            break;
        case 3:
            document.getElementById("weekday").value = "Jueves es día laborable";
            break;
        case 4:
            document.getElementById("weekday").value = "Viernes es día laborable";
            break;
        case 5:
            document.getElementById("weekday").value = "Sábado no es día laborable";
            break;
        case 6:
            document.getElementById("weekday").value = "Domingo no es día laborable";
            break;
    }
}

//Limpiar
function Limpiar() {
    document.getElementById("weekday").value= "";
}

    