function dayOfTheweek(){
    console.log("Funciona");
    let day = document.getElementById("day").value;
    console.log(day);
    let month = document.getElementById("month").value;
    console.log(month);
    let year = document.getElementById("year").value;
    console.log(year);

    const d = new Date(month+' '+day+', '+year);
    console.log(d);

    let nDay = d.getDay();
    console.log(nDay);

    switch(nDay){
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