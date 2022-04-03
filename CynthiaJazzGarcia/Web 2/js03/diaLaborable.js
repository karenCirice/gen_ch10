
/**
 * Valudar si la informacion es correcta
 * @param {number}  day //Es el dia de la fecha seleccionada
 * @param {number}  month //Es el dia de la fecha seleccionada
 * @param {number}  year //Es el año de la fecha seleccionada
 */



let calcularDia = () => {
    let day = parseInt(document.getElementById("day").value);
    console.log(day)
    let month = parseInt(document.getElementById("month").value);
    console.log(month)
    let year = parseInt(document.getElementById("year").value);
    console.log(year)

    const date = new Date(parseInt(year), parseInt(month) -1, parseInt(day));
    console.log(date);

    

    let numberDay= date.getDay(); 

    switch (numberDay) {
    case 0:
        document.getElementById("resultado").innerHTML = "Domingo, Día no laborable";
        break;
    case 1:
        document.getElementById("resultado").innerHTML = "Lunes, Día laborable";
        break;
    case 2:
        document.getElementById("resultado").innerHTML = "Martes, Día laborable";
        break;
    case 3:
        document.getElementById("resultado").innerHTML = "Miércoles, Día laborable";
        break;
    case 4:
        document.getElementById("resultado").innerHTML = "Jueves, Día laborable";
        break;
    case 5:
        day = "Friday";
        document.getElementById("resultado").innerHTML = "Viernes, Día laborable";
        break;
    case  6:
        day = "Saturday";
        document.getElementById("resultado").innerHTML = "Sábado, Día no laborable";
        break;
    }
}

