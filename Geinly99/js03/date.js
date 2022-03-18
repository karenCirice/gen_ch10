let calcular = ()=>{
    
    let fecha = new Date(parseInt(document.getElementById("year").value),parseInt(document.getElementById("month").value)-1,parseInt(document.getElementById("day").value));    
    definirFecha(fecha.getDay());

}

function definirFecha(dia){
    
    switch(dia){
        case 0:
            dia === 0 ? document.getElementById("fechaCalculada").value = "DOMINGO, FIN DE SEMANA" : document.getElementById("result").value = "SABADO, FIN DE SEMANA";
            break;
        case 1:
            document.getElementById("result").value = "LUNES, DIA LABORABLE";
            break;
        case 2:
            document.getElementById("result").value = "MARTES, DIA LABORABLE";
            break;
        case 3:
            document.getElementById("result").value = "MIERCOLES, DIA LABORABLE";
            break;
        case 4:
            document.getElementById("result").value = "JUEVES, DIA LABORABLE";
            break;
        case 5:
            document.getElementById("result").value = "VIERNES, DIA LABORABLE";
            break;
        case 6:
            document.getElementById("result").value = "SÁBADO, FIN DE SEMANA";
            break;
    }
}


