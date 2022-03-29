function calcularFecha(){
    let fecha = new Date(parseInt(document.getElementById("year").value),parseInt(document.getElementById("month").value)-1,parseInt(document.getElementById("day").value));
    imprimirFecha(fecha.getDay());
}

function imprimirFecha(day){
    // condicion ? resultado1 : resultado2
    switch(day){
        case 0:
            window.alert("Domingo, ¡día no laborable!");
            break;
        case 1:
            window.alert("Lunes, día laborable");
            break;
        case 2:
            window.alert("Martes, día laborable");
            break;
        case 3:
            window.alert("Miércoles, día laborable");
            break;
        case 4:
            window.alert("Jueves, día laborable");
            break;
        case 5:
            window.alert("Viernes, día laborable");
            break;
        case 6:
            window.alert("Sábado, ¡día no laborable!");

    }
}