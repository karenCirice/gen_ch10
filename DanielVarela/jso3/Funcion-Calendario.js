let calcular = () => {
    let dia = parseInt(document.getElementById("day").value);
    let mes = parseInt(document.getElementById("month").value - 1);
    let year = parseInt(document.getElementById("year").value);
    let fecha = new Date(year, mes, dia);
    definirFecha(fecha.getDay());
}
function definirFecha(dia) {
    switch (dia) {
        case 0:
            document.getElementById("result").value = "Lunes, Dia loboral";
            break;
        case 1:
            document.getElementById("result").value = "Martes, Dia loboral";
            break;
        case 2:
            document.getElementById("result").value = "Miercoles, Dia loboral";
            break;
        case 3:
            document.getElementById("result").value = "Jueves, Dia loboral";
            break;
        case 4:
            document.getElementById("result").value = "viernes, Dia loboral";
            break;
        case 5:
            document.getElementById("result").value = "sabado, No se labora";
            break;
        case 6:
            document.getElementById("result").value = "Domingo, No se labora"
            break;
    }
}


