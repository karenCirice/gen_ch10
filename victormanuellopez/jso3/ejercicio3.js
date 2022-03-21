function calculardia(){
    let dia = parseInt(document.getElementById("dia").value);
    let mes = parseInt(document.getElementById("mes").value);
    let año = parseInt(document.getElementById("año").value);

    const d = new Date(año,mes-1,dia);
    let day = d.getDay();
    
    switch (day) {
        case 0:
            document.getElementById("result").innerHTML = "Domingo, fin de semana.";
            break;
        case 1:
            document.getElementById("result").innerHTML = "Lunes, día laboral.";
            break;
        case 2:
            document.getElementById("result").innerHTML = "Martes, día laboral.";
            break;
        case 3:
            document.getElementById("result").innerHTML = "Miércoles, día laboral.";
            break;
        case 4:
            document.getElementById("result").innerHTML = "Jueves, día laboral.";
            break;
        case 5:
            document.getElementById("result").innerHTML = "Viernes, día laboral.";
            break;
        case 6:
            document.getElementById("result").innerHTML = "Sábado, fin de semana.";
            break;
        default:
          console.log("no se encontro la fecha.")
      }

    
}