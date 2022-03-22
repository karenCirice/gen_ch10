//Función calcular fecha 
let calcular = ()=>{
 let dia= parseInt(document.getElementById("day").value);
 let mes= parseInt(document.getElementById("month").value -1);
 let year=  parseInt(document.getElementById("year").value); 
 let fecha= new Date(year,mes,dia);
 definirFecha(fecha.getDay());
 //definirFecha(new Date(parseInt(document.getElementById("anio").value),parseInt(document.getElementById("mes").value)-1,parseInt(document.getElementById("dia").value)));
 //Forma más simplificada(todo lo de arriba en una sola línea)
}

function definirFecha(dia){
    
    switch(dia){
        case 0:
            //el día 0 es el domingo
            //el ? es el operador ternario: condicion ? resultado true : resultado false 
            //dia === 0 ? document.getElementById("fechaCalculada").value = "DOMINGO, FIN DE SEMANA" : document.getElementById("result").value = "SABADO, FIN DE SEMANA";
            document.getElementById("result").value = "DOMINGO, FIN DE SEMANA"
            break;
        case 1:
            document.getElementById("result").value = "LUNES, DIA LABORABLE";
            break;
        case 2:
            document.getElementById("result").value = "MARTES, DIA LABORABLE";
            break;
        case 3:
            document.getElementById("result").value = "MIERCOLES, DIA LABORABLE";
            break;
        case 4:
            document.getElementById("result").value = "JUEVES, DIA LABORABLE";
            break;
        case 5:
            document.getElementById("result").value = "VIERNES, DIA LABORABLE";
            break;
        case 6:
            document.getElementById("result").value = "SÁBADO, FIN DE SEMANA";
            break;
    }
}


