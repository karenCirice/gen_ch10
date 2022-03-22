let calcularFecha = ()=>{
    
    let fecha = new Date(parseInt(document.getElementById("anio").value),parseInt(document.getElementById("mes").value)-1,parseInt(document.getElementById("dia").value));    
    definirFecha(fecha.getDay());

}



function definirFecha(dia){
    
    switch(dia){
        case 0,6:
            dia === 0 ? document.getElementById("fechaCalculada").value = "DOMINGO, FIN DE SEMANA" : document.getElementById("fechaCalculada").value = "SABADO, FIN DE SEMANA";
            break;
        case 1:
            document.getElementById("fechaCalculada").value = "LUNES, DIA LABORABLE";
            break;
        case 2:
            document.getElementById("fechaCalculada").value = "MARTES, DIA LABORABLE";
            break;
        case 3:
            document.getElementById("fechaCalculada").value = "MIERCOLES, DIA LABORABLE";
            break;
        case 4:
            document.getElementById("fechaCalculada").value = "JUEVES, DIA LABORABLE";
            break;
        case 5:
            document.getElementById("fechaCalculada").value = "VIERNES, DIA LABORABLE";
            break;
    }
}
