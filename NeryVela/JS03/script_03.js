
    
    function myfunction_03(){
    let i= parseInt(document.getElementById("dia").value);
    let j= parseInt(document.getElementById("mes").value);
    let k= parseInt(document.getElementById("year").value);
    
    const d = new Date("2022/03/17");
    d.setFullYear(k, j-1, i);
    let day = d.getDay();
    
    document.getElementById("demo").innerHTML = day;
    
    switch (day)
    
    {
    
    case 0: document.getElementById("demo_1").innerHTML = "Domingo, Fin de Semana";
    break;
    case 1: document.getElementById("demo_1").innerHTML = "Lunes, día Laborable";
    break;
    case 2: document.getElementById("demo_1").innerHTML = "Martes, día Laborable";
    break;
    case 3: document.getElementById("demo_1").innerHTML = "Miércoles, día Laborable";
    break;
    case 4: document.getElementById("demo_1").innerHTML = "Jueves, día Laborable";
    break;
    case 5: document.getElementById("demo_1").innerHTML = "Viernes, día Laborable";
    break;
    case 6: document.getElementById("demo_1").innerHTML = "Sábado, Fin de Semana";
    break;
    }
    log.console("day");
    }
    
    