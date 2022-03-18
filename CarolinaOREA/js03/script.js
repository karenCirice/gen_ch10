function myFunction(){
var dia=parseInt(document.getElementById("day").value);
var mes=parseInt(document.getElementById("month").value)-1;
var year=parseInt(document.getElementById("year").value);
let d = new Date(year,mes,dia);
let day = d.getDay();
let WeekDay;



switch(day) {
    case  0:
        WeekDay = 'Domingo, día de descanso';
        break;
    case  1:
        WeekDay = 'Lunes, día Laborable';
        break;
    case  2:
        WeekDay = 'Martes, día Laborable';
        break;
    case  3:
        WeekDay = 'Miercoles, día Laborable';
        break;
    case  4:
        WeekDay = 'Jueves, día Laborable';
        break;
    case  5:
        WeekDay = 'Viernes , día Laborable';
        break;
    case  6:
        WeekDay = 'Sabado, día de descanso';
        break;
  }
document.getElementById("f").innerHTML = WeekDay;
}