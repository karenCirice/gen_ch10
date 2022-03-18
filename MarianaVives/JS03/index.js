/**
 * Valida si la información es correcta
 * @param {number} day //Es el día de la fecha seleccionada
 * @param {number} month // Es el mes de la fecha seleccionada
 * @param {number} year // Es el año de la fecha seleccionada
 * @returns {number} 
 * 
 */


function calcular() {
    let day = document.getElementById("day").value;
    console.log(day);
    let month = document.getElementById("month").value;
    console.log(month);
    let year = document.getElementById("year").value;
    console.log(year);

    let fecha = new Date(day, month, year);
    console.log(fecha);

    let nDay= d.getDay();
    console.log(nDay);
}

switch(nDay){
    case 0:
    document.getElementById("calcular").innerHTML="Lunes es día laborable";
    break;
}
switch(nDay){
    case 1:
    document.getElementById("calcular").innerHTML="Martes es día laborable";
    break;
}
switch(nDay){
    case 2:
    document.getElementById("calcular").innerHTML="Miércoles es día laborable";
    break;
}
switch(nDay){
    case 3:
    document.getElementById("calcular").innerHTML="Jueves es día laborable";
    break;
}
switch(nDay){
    case 4:
    document.getElementById("calcular").innerHTML="Viernes es día laborable";
    break;
}
switch (nDay){
    case 5:
    document.getElementById("calcular").innerHTML="Sábado es día laborable";
    break;

}
switch(nDay){
    case 6:
    document.getElementById("calcular").innerHTML="Domingo es día laborable";
    break;

}

// CLEAR
function clear () {
    document.getElementById("calcular").reset();
}
