function fechaLaborable(){
    let dia = parseInt(document.getElementById("dia").value);
    let mes = parseInt(document.getElementById("mes").value)-1;
    let year = parseInt(document.getElementById("year").value);
    let fecha = new Date(dia,mes,year);

    queFechaEs(fecha.getDay());
}

function queFechaEs(dia){
switch(dia){
    case 0:
    document.getElementById("fechaResultado").value = "Es Domingo, un fin de semana";
    break;
    case 1:
    document.getElementById("fechaResultado").value = "Es Lunes, día laborable";
    break;
    case 2:
    document.getElementById("fechaResultado").value = "Es Martes, un día laborable";
    break;
    case 3:
    document.getElementById("fechaResultado").value = "Es Miércoles, un día laborable";
    break;
    case 4:
    document.getElementById("fechaResultado").value = "Es Jueves, un día laborable";
    break;
    case 5:
    document.getElementById("fechaResultado").value = "Es Viernes, un día laborable";
    break;
    case 6:
    document.getElementById("fechaResultado").value = "Es Sábado, un fin de semana";
    break;
}
}