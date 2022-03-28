
function Calcular() {
    let dia = parseInt(document.getElementById("day").value);
    let mes = parseInt(document.getElementById("mt").value);
    let an = parseInt(document.getElementById("yr").value);
    
    const d = new Date(mes + " " + dia + " " + an);
    let day = d.getDay();
    switch (day) {
        case 0:
            document.getElementById("res").innerHTML = "<h4>Domingo, descanso</h4>"
            break;
        case 1:
            document.getElementById("res").innerHTML = "<h4>Lunes, laborable</h4>"
            break;
        case 2:
            document.getElementById("res").innerHTML = "<h4>Martes, laborable</h4>"
            break;
        case 3:
            document.getElementById("res").innerHTML = "<h4>Miercoles, laborable</h4>"
            break;
        case 4:
            document.getElementById("res").innerHTML = "<h4>Jueves, laborable</h4>"
            break;
        case 5:
            document.getElementById("res").innerHTML = "<h4>Viernes, laborable</h4>"
            break;
        case 6:
            document.getElementById("res").innerHTML = "<h4>Sabado, descanso</h4>"
            break;
        default:
            document.getElementById("res").innerHTML = "<h4>No hay dia</2>"
            break;
    }
}