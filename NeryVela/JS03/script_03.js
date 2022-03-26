
    
    function myfunction_03(){
    let i= parseInt(document.getElementById("dia").value); /*Se asgina el valor del campo de entrada del día a la variable i */
    let j= parseInt(document.getElementById("mes").value);  /*Se asgina el valor del campo de entrada del día a la variable j */
    let k= parseInt(document.getElementById("year").value);  /*Se asgina el valor del campo de entrada del día a la variable k */
     
    const d = new Date("2022/03/17"); /* Se asigna la funcion especial de js para fechas a la constante d */
    d.setFullYear(k, j-1, i); /* Se elige la fecha acorde a las variables (k, j-1, i) introducidas desde los campos de entrada, "j-1" se debe a que la funcion cuenta de 0 a 11 */
    let day = d.getDay(); /* El dia elegido almacenado en la variable "d" se asigna a la variable "day" */
    
    
    switch (day) /* Switch elige  un valor númerico de 0 a 6 almacenado en day acorde a los valores de la  función setFullYear */
    {
    
    case 0: document.getElementById("demo_1").innerHTML = "Domingo, Fin de Semana"; /* Se asigna un mensaje en la función especial para mostrar texto en html con identificador "demo_1" */
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
    
    function fun(){ /*Función para resetear los campos del formulario */
        document.getElementById("form_1").reset(); 
    }

    
    