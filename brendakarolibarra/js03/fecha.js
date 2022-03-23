function stringToDate(dateString){
    dateString = dateString.split('-');
    return new Date(dateString[0], dateString[1] - 1, dateString[2]);
}


function countWorkDay(date1, date2){
    date1 = stringToDate(date1);
    date2 = stringToDate(date2);
    delta = (date2-date1) / (1000 * 60 * 60 * 24) + 1; // calcula el tiempo total

    weeks = 0;
    for(i = 0; i < delta; i++){
                     if (date1.getDay () == 0 || date1.getDay () == 6) semanas ++; // agrega 1 si es sábado o domingo
        date1 = date1.valueOf();
        date1 += 1000 * 60 * 60 * 24;
        date1 = new Date(date1);
    }
    return delta - weeks;
}
console.log(countWorkDay('2017-08-01','2017-08-06'));  // 4
El método anterior es simple y grosero, pero tiene la gran desventaja de que si el lapso de tiempo es relativamente grande, la carga de trabajo del cálculo aquí será relativamente grande y la diferencia en un año es de 365 veces. Entonces el método es mejorado. Todos sabemos que hay 7 días a la semana, de los cuales dos días son fines de semana y 5 días son días hábiles. Entonces, un período de tiempo se puede considerar como un ciclo 0-6, es decir, 2017-08-01 es martes 2017-08- 12 es sábado, por lo que se puede considerar como 2, 3, 4, 5, 6, 0, 1, 2, 3, 4, 5, 6. Esto es lo mismo que nuestros problemas de matemáticas anteriores. Primero calcule esto al menos en algunos grupos Complete y luego cuente los días restantes
se implementa de la siguiente manera:

function countWorkDay(sDay,eDay){
    var s = stringToDate(sDay), e = stringToDate(eDay);
    var s_t_w = s.getDay(), e_t_w = e.getDay();

             // Diferencia en días
    var diffDay = (e - s) / (1000 * 60 * 60 * 24) + 1;
    var diffWeekDay = diffDay - (s_t_w ==0?0:7-s_t_w) + e_t_w;
             // El cálculo tiene varias semanas completas
    var weeks = Math.floor(diffWeekDay/7);
             if (weeks <= 0) {// En la misma semana, es decir, la hora de inicio y finalización no puede ser el domingo y el sábado (el domingo es el primer día de la semana)
        return e_t_w-s_t_w+(s_t_w?1:0)+(e_t_w==6?-1:0);
    }else{
        return weeks*5 + (e_t_w==6?5:e_t_w) + ( s_t_w >= 1 && s_t_w <= 5 ? (6-s_t_w):0);
    }
}

console.log(countWorkDay('2017-08-01','2017-08-06'));
Los anteriores son dos métodos para calcular los días laborables.


