

let calcularFecha = ()=>{
    let fecha = new Date(parseInt(document.getElementById("anio").value),parseInt(document.getElementById("mes").value)-1,parseInt(document.getElementById("dia").value));
    definirFecha(fecha.getDay());
}

function definirFecha(dia){
    // condicion ? resultado1 : resultado2
    switch(dia){
        case 0:
            document.getElementById("calculofecha").value = "Domingo, Fin de Semana";
            break;
        case 1:
            document.getElementById("calculofecha").value = "Lunes, Día Laborable";
            break;
        case 2:
            document.getElementById("calculofecha").value = "Martes, Día Laborable";
            break;
        case 3:
            document.getElementById("calculofecha").value = "Miercoles, Día Laborable";
            break;
        case 4:
            document.getElementById("calculofecha").value = "Jueves, Día Laborable";
            break;
        case 5:
            document.getElementById("calculofecha").value = "Viernes, Día Laborable";
            break;
        case 6:
            document.getElementById("calculofecha").value = "Sabado, Fin de Semana";

    }

}