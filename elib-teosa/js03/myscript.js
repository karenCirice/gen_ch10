// Variables obtenidas desde el documento HTML
let day = document.getElementById("day");
let month = document.getElementById("month");
let year = document.getElementById("year");
let result = document.getElementById("result");

/**
 * @function calcular Calcula el día de la semana de la fecha que se ha introducido y menciona si es un día laborable o no
 */

function calcular() {
  let date = new Date(parseInt(year.value), parseInt(month.value)-1, parseInt(day.value));
  console.log("Date: ", date);
  let dayWeek = date.getDay();

  switch (dayWeek) {
    case 0:
      result.value = "Domingo, día no laboral";
      break;
    case 1:
      result.value = "Lunes, día laboral";
      break;
    case 2:
      result.value = "Martes, día laboral";
      break;
    case 3:
      result.value = "Miércoles, día laboral";
      break;
    case 4:
      result.value = "Jueves, día laboral";
      break;
    case 5:
      result.value = "Viernes, día laboral";
      break;
    case 6:
      result.value = "Sábado, día no laboral";
      break;
    default:
      break;
  }
}
