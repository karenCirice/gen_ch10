
/**
 * la funcion regresa el resultado de switch, cuando el usuario
 * da click al boton calcular.
 */
function calcular() {
    // regresa el string que el usuario escribe y lo devuelve a numero entero.
    let dia = parseInt(document.getElementById('dia').value);
    let mes = parseInt(document.getElementById('mes').value);
    let año = parseInt(document.getElementById('año').value);

    // los meses comienzan desde 0.
    const d = new Date(año, mes - 1, dia);
    let day = d.getDay();

    //envalua que el valor de la variable day, coincida con el valor de case
    // y ejecuta la declaracion asociada a el.

    switch (day) {
        case 1:
            day = "Lunes,  día laborable :(";
            break;
        case 2:
            day = "Martes,  día laborable :(";
            break;
        case 3:
            day = "Miercoles,  día laborable :(";
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

    //la respuesta de switch se mostrara el input text de resultado.
    document.getElementById("resultado").value = day;

}