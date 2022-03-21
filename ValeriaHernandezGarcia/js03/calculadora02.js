function calcular() {
    let dia = parseInt(document.getElementById("dia").value);
    let mes = parseInt(document.getElementById("mes").value);
    let año = parseInt(document.getElementById("año").value);
    const d = new Date(mes + " " + dia + " " + año);
    let day = d.getDay();
    switch (day) {
        case 0:
            document.getElementById("res").innerHTML = "<h2>Domingo descanso</h2>"
            break;
        case 1:
            document.getElementById("res").innerHTML = "<h2>Lunes laborable</h2>"
            break;
        case 2:
            document.getElementById("res").innerHTML = "<h2>Martes laborable</h2>"
            break;
        case 3:
            document.getElementById("res").innerHTML = "<h2>Miercoles laborable</h2>"
            break;
        case 4:
            document.getElementById("res").innerHTML = "<h2>Jueves laborable</h2>"
            break;
        case 5:
            document.getElementById("res").innerHTML = "<h2>Viernes laborable</h2>"
            break;
        case 6:
            document.getElementById("res").innerHTML = "<h2>Sabado descanso</h2>"
            break;
        default:
            document.getElementById("res").innerHTML = "<h2><i>No hay día</i></h2>"
            break;
    }
}