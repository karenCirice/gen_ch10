

function calcular(){

    //Declarar variables locales con los valores que va a tomar de los inputs//

    let dia = parseInt(document.getElementById("dia").value);
    console.log(dia);
    let mes = parseInt(document.getElementById("mes").value-1); /*OJO!!! los meses van del 0-11 como si see stuvieran tomando como índices
    siendo el 0= Enero, por eso tenemos que restar a la variable de mes -1!!*/
    console.log(mes);

    let año= parseInt(document.getElementById("año").value);
    console.log(año);

    // usando swift: cada caso de tener un break para romper una vez que se cumpla//

    let fecha = new Date (año,mes,dia);
    console.log(fecha);

    let noDia = fecha.getDay();
    console.log(noDia);

    switch (noDia) {
        case 0:
            document.getElementById("diasemana").value = "Lunes/día laborable, checar si no es puente"; //Investigar como hacer el código para identificar cuando sea puente y lo arroje//
            break;
    }

    console.log(noDia);

    switch (noDia) {
        case 1:
            document.getElementById("diasemana").value = "Martes/día laborable";
            break;
    }

    console.log(noDia);

    switch (noDia) {
        case 2:
            document.getElementById("diasemana").value = "Miercoles/día laborable";
            break;
    }

    console.log(noDia);

    switch (noDia) {
        case 3:
            document.getElementById("diasemana").value = "Jueves/día laborable";
            break;
    }


    console.log(noDia+"case3");
    switch (noDia) {
        case 4:
            document.getElementById("diasemana").value = "Viernes/día laborable";
            break;
    }
    switch (noDia) {
        case 5:
            document.getElementById("diasemana").value = "Sábado/día no laborable, toma un buen descanso :)";
            break;
    }

    switch (noDia) {
        case 6:
            document.getElementById("diasemana").value = "Domingo/día no laborable, prepárate para iniciar semana :)";
            break;
    }

}

function Functionclear() {
    document.getElementById("diasemana").value= "";
}