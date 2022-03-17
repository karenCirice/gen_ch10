function calcula(){
    let a = parseInt(document.getElementById("dia").value)-3;
    let b = parseInt(document.getElementById("mes").value);
    let c = parseInt(document.getElementById("año").value);
    let d = new Date(c,b,a); //Ordenados así: mes, día, año
    let day = d.getDay()
    //document.getElementById("prueba").innerHTML = "El resultado es: " +day;

    switch (day) {
        case 0:
            document.getElementById("resultado").innerHTML = "Día NO laborable! Domingo! :D"
            break;

        case 6:
            document.getElementById("resultado").innerHTML = "Día NO laborable! Sabadrink! :D"
            break;

        case 1:
        document.getElementById("resultado").innerHTML = "Día laborable, Lunes:c"
        break;

        case 2:
        document.getElementById("resultado").innerHTML = "Día laborable, martes"
        break;

        case 3:
        document.getElementById("resultado").innerHTML = "Día laborable, miércoles"
        break;

        case 4:
        document.getElementById("resultado").innerHTML = "Día laborable, jueves"
        break;

        case 5:
        document.getElementById("resultado").innerHTML = "Día laborable, viernes"
        break;

        default:
            document.getElementById("resultado").innerHTML = "Día laborable!"
            break;
    }
}

