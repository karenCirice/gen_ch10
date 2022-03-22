let calcularFecha = ()=>{
    let fecha = new Date(parseInt(document.getElementById("anio").value),parseInt(document.getElementById("mes").value)-1,parseInt(document.getElementById("dia").value));
    definirFecha(fecha.getDay());
}

function definirFecha(dia){
    // condicion ? resultado1 : resultado2
    switch(dia){
        case 0:
            document.getElementById("fechaCalculada").innerHTML = "FIN DE SEMANA";
            break;
        case 6:
            document.getElementById("fechaCalculada").innerHTML = "FIN DE SEMANA";
            break;
        default:
            document.getElementById("fechaCalculada").innerHTML = "DIA LABORABLE";
            break;

    }
}