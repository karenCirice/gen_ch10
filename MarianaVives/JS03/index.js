/**
 * Valida si la información es correcta
 * @param {number} day //Es el día de la fecha seleccionada
 * @param {number} month // Es el mes de la fecha seleccionada
 * @param {number} year // Es el año de la fecha seleccionada
 * @returns {number} 
 * 
 */


function calcular() {
    let day = parseInt(document.getElementById("day").value);
    console.log(day);
    let month = parseInt(document.getElementById("month").value)-1;
    console.log(month);
    let year = parseInt(document.getElementById("year").value);
    console.log(year);

    let fecha = new Date(day, month, year);
    console.log(fecha);

    let nDay = fecha.getDay();
    console.log(nDay);

    switch (nDay) {
        case 0:
            document.getElementById("weekday").value = "Lunes es día laborable";
            break;
    }
    switch (nDay) {
        case 1:
            document.getElementById("weekday").value = "Martes es día laborable";
            break;
    }
    switch (nDay) {
        case 2:
            document.getElementById("weekday").value = "Miércoles es día laborable";
            break;
    }
    switch (nDay) {
        case 3:
            document.getElementById("weekday").value = "Jueves es día laborable";
            break;
    }
    switch (nDay) {
        case 4:
            document.getElementById("weekday").value = "Viernes es día laborable";
            break;
    }
    switch (nDay) {
        case 5:
            document.getElementById("weekday").value = "Sábado no es día laborable";
            break;

    }
    switch (nDay) {
        case 6:
            document.getElementById("weekday").value = "Domingo no es día laborable";
            break;
    }
}

// CLEAR
function clear() {
    document.getElementById("weekday").value= "";
}
