/* Funcion para obtener dia, mes y año*/
function Calcula() {
  console.log("Calcula");
  let a = parseInt(document.getElementById("day").value);
  console.log(a);
  let b = parseInt(document.getElementById("month").value)-1;
  console.log(b);
  let c = parseInt(document.getElementById("year").value);
  console.log(c);

/* Función para calcular el día de la semana */
const d = new Date(c,b,a);
console.log(d);
let day = d.getDay();
console.log(day);

/* Switch para arrojar mensaje dependiendo del día de la semana*/
switch (day) {
  case 0:
    document.getElementById("diaSemana").value = "Sunday, Weekend";
    break;
  case 1:
    document.getElementById("diaSemana").value = "Monday, Week Day";
    break;
  case 2:
    document.getElementById("diaSemana").value = "Tuesday, Week Day";
    break;
  case 3:
    document.getElementById("diaSemana").value = "Wednesday, Week Day";
    break;
  case 4:
    document.getElementById("diaSemana").value = "Thursday, Week Day";
    break;
  case 5:
    document.getElementById("diaSemana").value = "Friday, Week Day";
    break;
  case 6:
    document.getElementById("diaSemana").value = "Saturday, Weekend";
    break;
}
}

/* Función para limpiar todos los campos */
Clear = () => {
  document.getElementById("day").value = "";
  document.getElementById("month").value = "";
  document.getElementById("year").value = "";
  document.getElementById("diaSemana").value = "";
}
