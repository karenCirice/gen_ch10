function validar(day, month, year) {

    console.log(day, month, year);
    if ((day == undefined || month == undefined || year == undefined) || (isNaN(day) || isNaN(month) || isNaN(year)) || (day == null || month == null || year == null)) {
        return 1;
    }
    else if ((day >= 1 && day <= 31) && (month >= 1 && month <= 12) && (year >= 0)) {
        return 2;
    }
    else {
        return 3;
    }
}
function printDay() {
    let day = parseInt(document.getElementById("day").value);
    let month = parseInt(document.getElementById("month").value);
    let year = parseInt(document.getElementById("year").value);
    console.log(day, month, year);
    switch (validar(day, month, year)) {
        case 1:
            alert("Fecha no Definida")
            return;
        case 2:
            /* alert("Fecha Valida") */
            break;
        case 3:
            alert("Fecha no Valida")
            return;
    }
    const d = new Date(month + "," + day + "," + year);
    console.log(d);
    switch (d.getDay()) {
        case 1:
            document.getElementById("res").value = "Lunes, Dia Laborable";
            break;
        case 2:
            document.getElementById("res").value = "Martes, Dia Laborable";
            break;
        case 3:
            document.getElementById("res").value = "Miercoles, Dia Laborable";
            break;
        case 4:
            document.getElementById("res").value = "Jueves, Dia Laborable";
            break;
        case 5:
            document.getElementById("res").value = "Viernes, Dia Laborable";
            break;
        case 6:
            document.getElementById("res").value = "Sabado, Dia Laborable";
            break;
        case 0:
            document.getElementById("res").value = "Domingo, Dia Laborable";
            break;
    }
}
