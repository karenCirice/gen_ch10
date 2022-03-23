
/*Función para calcular el día de la semana*/ 
function calculate() {  
    let día = parseInt(document.getElementById("day").value),
        mes = parseInt(document.getElementById("month").value) - 1,
        año = parseInt(document.getElementById("year").value);
    const fecha = new Date(año, mes, día);
    let resultado = fecha.getDay();
    console.log(resultado);

    switch (resultado) {
        case 0:
            document.getElementById("resultado").innerHTML = 'Domingo, fin de semana';
            break;
        case 1:
            document.getElementById("resultado").innerHTML = 'Lunes, día laboral';
            break;
        case 2:
            document.getElementById("resultado").innerHTML = 'Martes, día laboral';
            break;
        case 3:
            document.getElementById("resultado").innerHTML = 'Miércoles, día laboral';
            break;
        case 4:
            document.getElementById("resultado").innerHTML = 'Jueves, día laboral';
            break;
        case 5:
            document.getElementById("resultado").innerHTML = 'Viernes, día laboral';
            break;
        case 6:
            document.getElementById("resultado").innerHTML = 'Sábado, fin de semana';
    }
}

/*Función para limpiar la interfaz*/
function clean() {
    document.getElementById("day").value = null;
    document.getElementById("month").value = null; //Investigar como retornar a la opción inicial seleccionada
    document.getElementById("year").value = null;
}