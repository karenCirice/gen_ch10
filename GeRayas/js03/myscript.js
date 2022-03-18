let resultado;
//Función Calcular Dia De La Semana Laboral
function calcular() {
    let día = parseInt(document.getElementById("día").value);
    let mes = parseInt(document.getElementById("mes").value) - 1;
    let año = parseInt(document.getElementById("año").value);
    const fecha = new Date(año, mes, día);
    resultado = fecha.getDay();
    console.log(resultado);

    switch (resultado) {
        case 0, 6:
            resultado === 0 ? document.getElementById("resultado").value = 'DOMINGO, FIN DE SEMANA' : document.getElementById("resultado").value = 'SABADO, FIN DE SEMANA';
            break;
        case 1:
            document.getElementById("resultado").value = 'LUNES, DIA LABORAL';
            break;
        case 2:
            document.getElementById("resultado").value = 'MARTES, DIA LABORAL';
            break;
        case 3:
            document.getElementById("resultado").value = 'MIERCOLES, DIA LABORAL';
            break;
        case 4:
            document.getElementById("resultado").value = 'JUEVES, DIA LABORAL';
            break;
        case 5:
            document.getElementById("resultado").value = 'VIERNES, DIA LABORAL';
            break;
    }
}
/*FUNCIÓN LIMPIAR*/
function limpiar() {
    document.getElementById("Formulario").reset();
}




