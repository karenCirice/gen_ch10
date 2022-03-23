// Función que se ajacutará al dar click en el boton de "calcular" 
function dayOfTheweek() {
    console.log("Funciona");
    // Obtenemos los valores de los inputs
    let day = document.getElementById("dia").value;
    console.log(day);
    let month = document.getElementById("mes").value;
    console.log(month);
    let year = document.getElementById("año").value;
    console.log(year);
    // Constante "d" que guardará una fecha con la función "Date" la cual calculará la fecha en basé a los valores dia, mes y año convertidos a String
    const d = new Date(month + " " + day + ", " + year);
    console.log(d);

    //La función .getDay ontendrá el día de la semana como un valor numerico del 0 al 6 de la variable "d" y lo guardará en una variavle "nDay"

    let nDay = d.getDay();
    console.log(nDay);

    //Creamos un Switch que de un resultado distinto dependiendo del valor que tenga nDay 

    switch (nDay) {
        case 0:
            document.getElementById("calculo").innerHTML =
                "Domingo, día No laborable";
            break;

        case 1:
            document.getElementById("calculo").innerHTML = "Lunes, día laborable";
            break;

        case 2:
            document.getElementById("calculo").innerHTML = "Martes, día laborable";
            break;

        case 3:
            document.getElementById("calculo").innerHTML = "Miercoles, día laborable";
            break;

        case 4:
            document.getElementById("calculo").innerHTML = "Jueves, día laborable";
            break;

        case 5:
            document.getElementById("calculo").innerHTML = "Viernes, día laborable";
            break;

        case 6:
            document.getElementById("calculo").innerHTML = "Sabado, día No laborable";
    }
}
