function DíaMesyAño() {
    let Días = document.getElementById("Días").value;
    let Meses = document.getElementById("Meses").value;
    let Años = document.getElementById("Años").value;

    let d = new Date(parseInt(Días),parseInt(Meses),parseInt(Años));

    let NumeroD = d.getDay();
    // El método getDay() devuelve el día de la semana de la fecha especificada en función de la fecha local; siendo 0 (Domingo) el primer día.

    switch (NumeroD) {
        // switch evalúa una expresión, comparando el valor de esa expresión con una instancia case , y ejecuta declaraciones asociadas a ese case
        case 0:
            Eldíaes.value = "Domingo No laborable";
        break;
        
        case 1:
            Eldíaes.value = "Lunes Laborable";
        break;

        case 2:
            Eldíaes.value = "Martes laborable";
        break;

        case 3:
            Eldíaes.value = "Miercoles laborable";
        break;

        case 4:
            Eldíaes.value = "Jueves laborable";
        break;

        case 5:
            Eldíaes.value = "Viernes laborable";
        break;

        case 6:
            Eldíaes.value = "Sábado No laborable";
        
    }


}