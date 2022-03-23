let fecha = [];
let f;

function obDia(){

    fecha[0] = document.getElementById("dia").value;
    fecha[1] = document.getElementById("mes").value - 1;
    fecha[2] = document.getElementById("año").value;


    const result = new Date(fecha[2], fecha[1], fecha[0])
     f = result.getDay(fecha[2]);

    switch(f){

        case 0:
            document.getElementById("resultado").innerHTML = "Domingo, Día no laborable";
        break;
        case 1:
        document.getElementById("resultado").innerHTML = "Lunes, Día laborable";
        break;
        case 2:
            document.getElementById("resultado").innerHTML = "Martes, Día laborable";
        break;
        case 3:
            document.getElementById("resultado").innerHTML = "Miercoles, Día laborable";
        break;
        case 4:
            document.getElementById("resultado").innerHTML = "Jueves, Día laborable";
        break;
        case 5:
            document.getElementById("resultado").innerHTML = "Viernes, Día laborable";
        break;
        case 6:
            document.getElementById("resultado").innerHTML = "Sabado, Día no laborable";
        break;
        default:
            document.getElementById("resultado").innerHTML = f;
        break;
    }

    

}
