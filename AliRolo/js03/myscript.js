console.log("Iniciando script");

let calculateDay = () => {
    let day = document.getElementById("day").value;
    let month = document.getElementById("month").value;
    let year = document.getElementById("year").value;

    let isWorkday = "";
    let dayOfTheWeek = "";


    const date = new Date(parseInt(year), parseInt(month) - 1, parseInt(day));
    console.log(date);

    let dayNumber = date.getDay();

    switch (dayNumber) {
        case 0:
            dayOfTheWeek = "Domingo";
            isWorkday = "día no laborable";
        break;
        case 1:
            dayOfTheWeek = "Lunes";
            isWorkday = "día laborable";
        break;
        case 2:
            dayOfTheWeek = "Martes";
            isWorkday = "día laborable";
        break;
        case 3:
            dayOfTheWeek = "Miércoles";
            isWorkday = "día laborable";
        break;
        case 4:
            dayOfTheWeek = "Jueves";
            isWorkday = "día laborable";
        break;
        case 5:
            dayOfTheWeek = "Viernes";
            isWorkday = "día laborable";
        break;
        case 6:
            dayOfTheWeek = "Sábado";
            isWorkday = "día no laborable";
        break;
    }

    document.getElementById("result").innerHTML = dayOfTheWeek + ", " + isWorkday;
}
