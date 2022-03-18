
function calcular() {
    let dia = document.getElementById('dia').value;
    let mes = document.getElementById('mes').value;
    let año = document.getElementById('año').value;

    // los meses comienzan desde 0.
    const d = new Date(año,mes-1,dia);
    let day = d.getDay();
    
    console.log(day);


    switch (day) {
        case 1:
            day = "Lunes,  día laborable :(";
            break;
        case 2:
            day = "Marte,  día laborable :(";
            break;
        case 3:
            day= "Miercoles,  día laborable :(";
            break;
        case 4:
            day = "Jueves,  día laborable :(";
            break;
        case 5:
            day = "Viernes,  día laborable :(";
            break;
        case 6:
            day = "Sabado,  día no laborable :)";
            break;
        case 0:
            day = "Domingo, día no laborable :)";
            break;
    }

    document.getElementById("resultado").value =  day;

}