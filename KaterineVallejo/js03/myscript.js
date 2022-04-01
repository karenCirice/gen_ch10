let day = document.getElementById("day");
let month = document.getElementById("month");
let year = document.getElementById("year");
let result = document.getElementById("result");

let date = new Date();
function calcular() {
  date.setDate(parseInt(day.value));
  date.setMonth(parseInt(month.value)-1);
  date.setFullYear(parseInt(year.value));
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