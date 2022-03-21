function laboralFecha(){
    let dia = parseInt(document.getElementById("dia").value);
    let mes = parseInt(document.getElementById("mes").value)-1;
    let year = parseInt(document.getElementById("year").value);
    let fecha = new Date(year,mes,dia);

    llamarFecha(fecha.getDay());
}

function llamarFecha(dia){
switch(dia){
    case 0:
    document.getElementById("res").value = "Domingo, fin de semana";
    break;
    case 1:
    document.getElementById("res").value = "Lunes, laboral";
    break;
    case 2:
    document.getElementById("res").value = "Martes, laboral";
    break;
    case 3:
    document.getElementById("res").value = "Miércoles, laboral";
    break;
    case 4:
    document.getElementById("res").value = "Jueves, laboral";
    break;
    case 5:
    document.getElementById("res").value = "Viernes, laboral";
    break;
    case 6:
    document.getElementById("res").value = "Sábado, fin de semana";
    break;
}
}