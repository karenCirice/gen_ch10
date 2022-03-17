let dia = document.getElementById("día");
let mes = document.getElementById("mes");
let año = document.getElementById("año");
let resultado = document.getElementById("resultado");

let date = new Date();
function fecha(){
    date.setDate(parseInt(dia.value));
    date.setMonth(parseInt(mes.value)-1);
    date.setFullYear(parseInt(año.value));
    console.log("Date: ",date)
    let diaSemana = date.getDate();

    switch (diaSemana){
        case 0:
            resultado.value = "Domingo, día de descanso";
            break;
        case 1:
            resultado.value = "Lunes, día laboral";
            break;
        case 2:
            resultado.value = "Martes, día laboral";
            break;
        case 3:
            resultado.value = "Miércoles, día laboral";
            break;
        case 4:
            resultado.value = "Jueves, día laboral";
            break;
        case 5:
            resultado.value = "Viernes, día laboral";
            break;
        case 6:
            resultado.value = "Domingo, día de descanso";
            break;
        default:
            break;
    }
}

let noFecha =() => {
    document.getElementById("día").value="";
    document.getElementById("mes").value="";
    document.getElementById("año").value="";
}
