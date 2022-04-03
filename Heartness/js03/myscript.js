function dayOfTheweek(){ /* Creamos nuestra función que se ajacutará al dar click sobre el Botón en el HTML */
    console.log("Funciona");
    let day = document.getElementById("day").value; /* Creamos una varable que obtendra un valor numerico que representara el dia desde un input en el HTML con el ID "day" */
    console.log(day);
    let month = document.getElementById("month").value; /* Creamos una varable que obtendra un valor numerico que representara el mes desde un input en el HTML con el ID "month" */
    console.log(month);
    let year = document.getElementById("year").value; /* Creamos una varable que obtendra un valor numerico que representara el año desde un input en el HTML con el ID "year" */
    console.log(year);

    const d = new Date(month+' '+day+', '+year); /* Creamos una varable "d" que guardará una fecha con la función "Date" la cual calculará la fecha en basé a los valores de day, month y year convertidos a String*/
    console.log(d);

    let nDay = d.getDay(); /* La función .getDay ontendrá el día de la semana como un valor numerico del 0 al 6 de la variable "d" y lo guardará en una variavle "nDay" */
    console.log(nDay);

    switch(nDay){ /* Creamos un Switch que de un resultado distinto dependiendo del valor que tenga nDay (numeros del 0 al 6) */
        case 0:
            document.getElementById("calculo").innerHTML = "Domingo, día No laborable";
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