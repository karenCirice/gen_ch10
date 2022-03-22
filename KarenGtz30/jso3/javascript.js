function fechaLaborable(){
    let dia = parseInt(document.getElementById("Dia").value);
    let mes = parseInt(document.getElementById("Mes").value);
    let año = parseInt(document.getElementById("Año").value);
    let fecha = new Date(año,mes,dia);

    queFechaEs(fecha.getDay());
}

function queFechaEs(dia){
switch(dia){
    case 0:
    document.getElementById("resultado").value = "Es Domingo, un fin de semana";
    break;
    case 1:
    document.getElementById("resultado").value = "Es Lunes, día laborable";
    break;
    case 2:
    document.getElementById("resultado").value = "Es Martes, un día laborable";
    break;
    case 3:
    document.getElementById("resultado").value = "Es Miércoles, un día laborable";
    break;
    case 4:
    document.getElementById("resultado").value = "Es Jueves, un día laborable";
    break;
    case 5:
    document.getElementById("resultado").value = "Es Viernes, un día laborable";
    break;
    case 6:
    document.getElementById("resultado").value = "Es Sábado, un fin de semana";
    break;
}
}