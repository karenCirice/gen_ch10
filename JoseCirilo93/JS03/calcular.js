/**
 * fuction valida la fecha sea correcta
 * @param {number} ingresarDia  //Se seleccona el dia de la fecha
 * @param {number} ingresarMes  //Se seleccona el mes de la fecha
 * @param {number} ingresarAño  //Se seleccona el año de la fecha
 * @param {Date} getDay método devuelve el día de la semana para la fecha especificada según la hora local.
 * @param switch evalúa una expresión, comparando el valor de esa expresión con una instancia case, 
 * @ y ejecuta declaraciones asociadas a ese case, así como las declaraciones en los case que siguen.
 * 
 */

function calculadora() {
    let ingresarDia = parseInt(document.getElementById("ingrsarDia").value);
    let ingresarMes = parseInt(document.getElementById("ingresarMes").value)-1;
    let ingresarAño =  parseInt(document.getElementById("ingresarAño").value);

    let d = new Date(parseInt(ingresarDia), parseInt(ingresarMes), parseInt(ingresarAño));

    let d1 = d.getDay();


    switch (d1) {

        case 0:
            diaEs.value = "Domingo, No es laborable";
            break;

        case 1:
            diaEs.value = "Lunes, Dia Laborable";
            break;

        case 2:
            diaEs.value = "Martes, Dia Laborable";
            break;

        case 3:
            diaEs.value = "Miercoles, Dia Laborable";
            break;

        case 4:
            diaEs.value = "Jueves, Dia Laborable";
            break;

        case 5:
            diaEs.value = "Viernes, Dia Laborable";
            break;

        case 6:
            diaEs.value = "Sábado, No es Laborable";

    }
}