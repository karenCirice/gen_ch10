    let calcular = () => {
        let dia = document.getElementById("dia").value;
        let mes = document.getElementById("mes").value;
        let año = document.getElementById("año").value;

        let date = new Date(parseInt(dia), parseInt(mes), parseInt(año));
        console.log(date);


    let semana = date.getDay();

    switch (semana) {
        case 0:
            resultado.value = "Lunes, día laborable";
            break;
        case 1:
            resultado.value = "Martes, día laborable";
            break;
        case 2:
            resultado.value = "Miercoles, día laborable";
            break;
        case 3:
            resultado.value = "Jueves, día laborable";
            break;
        case 4:
            resultado.value = "Viernes, día laborable";
            break;
        case 5:
            resultado.value = "Sabado, día no laborable";
            break;
        case 6:
            resultado.value = "Domingo, día no laborable";
            break;


    }
}

    function borrar() {
    document.getElementById("dia").value = "";
    document.getElementById("mes").value = "";
    document.getElementById("año").value = "";
    document.getElementById("resultado").value = "";
}