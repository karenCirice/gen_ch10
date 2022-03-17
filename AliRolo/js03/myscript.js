console.log("Iniciando script");

let calculateDay = () => {
    let day = document.getElementById("day").value;
    let month = document.getElementById("month").value;
    let year = document.getElementById("year").value;


    const date = new Date(parseInt(year), parseInt(month) - 1, parseInt(day));
    console.log(date);

    let dayNumber = date.getDay();

    switch (dayNumber) {
        case 0:
        case 6:
            document.getElementById("result").innerHTML = "Día no laborable";
        break;
        default:
            document.getElementById("result").innerHTML = "Día laborable";
        break;
    }
}
