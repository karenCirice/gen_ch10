let dia = document.getElementById("día");
let mes = document.getElementById("mes");
let año = document.getElementById("año");

let date = new Date();
function calcular(){
    date.setDate(parseInt(dia.value));
    date.setMonth(parseInt(mes.value)-1);
    date.setFullYear(parseInt(año.value));
    console.log("Date: ",date);
    let diaSemana = date.getDay();

    switch (diaSemana){
        case 0:
            resultado.value = "Domingo, día no laborable";
            break;
        case 1:
            resultado.value = "Lunes, día laborable";
            break;
        case 2:
            resultado.value = "Martes, día laborable";
            break;
        case 3:
            resultado.value = "Miércoles, día laborable";
            break;
        case 4:
            resultado.value = "Jueves, día laborable";
            break;
        case 5:
            resultado.value = "Viernes, día laborable";
            break;
        case 6:
            resultado.value = "Sábado, día no laborable";
            break;
        default:
            break;
    }
}

let borrar =() => {
    document.getElementById("día").value="";
    document.getElementById("mes").value="";
    document.getElementById("año").value="";
    document.getElementById("resultado").value="";
}
