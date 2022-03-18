function fecha(){
    let dia = parseInt (document.getElementById("dia").value)-3;
    let mes = parseInt (document.getElementById("mes").value);
    let ano = parseInt (document.getElementById("ano").value);
    let d = new Date(ano, mes, dia);
let day = (d.getDay());
document.getElementById("d").innerHTML = "El resultado es: " + day;
console.log(day);

switch (day) {
    case 0:
        document.getElementById("d").innerHTML = "Domingo ,Dia no laborable"
        //console.log (0);
        break;
    case 1:
            document.getElementById("d").innerHTML = "Lunes, Dia  laborable"
           // console.log(1);
            break;
     case 2:
            document.getElementById("d").innerHTML = "Martes, Dia laborable"
           // console.log(1);
            break;
     case 3:
                document.getElementById("d").innerHTML = "Miercoles, Dia laborable"
               // console.log(1);
                break;
    case 4:
            document.getElementById("d").innerHTML = "Jueves, Dia laborable"
           // console.log(1);
            break;
     case 5:
                document.getElementById("d").innerHTML = "Viernes, Dia laborable"
               // console.log(1);
                break;

    default:
        document.getElementById("d").innerHTML = "Sabado,Dia no laborable"
        break;

}
}
