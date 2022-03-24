
/**
 * Valida si la fecha introducida es correcta.
 * @param {number} day Día del año
 * @param {number} month Mes del año
 * @param {number} year Año seleccionado
 * @returns {number} 1: Vacío, 2: Dato válido, 3: Dato no válido
 */
function validar(day, month, year) {

    console.log(day, month, year);
    /**
     * @param return 1 Devuelve en caso de no estar Definida la fecha
     * @param return 2 Devuelve fecha correcta
     * @param return 3 Devuelve fecha incorrecta
     */
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
        case 1: //Lunes
            document.getElementById("res").value = "Lunes, Dia Laborable";
            break;
        case 2: //Martes
            document.getElementById("res").value = "Martes, Dia Laborable";
            break;
        case 3: //Miercoles
            document.getElementById("res").value = "Miercoles, Dia Laborable";
            break;
        case 4: //Jueves
            document.getElementById("res").value = "Jueves, Dia Laborable";
            break;
        case 5: //Viernes
            document.getElementById("res").value = "Viernes, Dia Laborable";
            break;
        case 6: //Sabado
            document.getElementById("res").value = "Sabado, Dia no Laborable";
            break;
        case 0: //Domingo
            document.getElementById("res").value = "Domingo, Dia no Laborable";
            break;
    }
}
