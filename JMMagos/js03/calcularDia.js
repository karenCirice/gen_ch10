/**
 * Función encargada de determinar si una fecha dada es laboral o no laboral según una fórmula que la calcula
 * utilizando tres parámetros que deben ser válidos, día mes y año.
 * 
 */

function calcular_dia(){
    let a=0, d=0;

    //se consigue lo que valga el elemento día
    let dia=parseInt(document.getElementById("d").value);
    console.log("dia  %d",dia);
    //se consigue lo que valga el elemento mes
    let mes=parseInt(document.getElementById("m").value);
    console.log("mes %d",mes);
    //se consigue lo que valga el elemento año
    let ano=parseInt(document.getElementById("a").value);
    console.log("año %d",ano);
    /*document.getElementById("resultado").textContent=c;*/

    if(valorValido(dia, mes)){
        a=dia+constanteMes(ano, mes)+ano%100+(ano%100/4)+constanteK(ano);
        d=a%7;
        d=parseInt(d);
        console.log(d);
        if(d>=1 && d<=5){
            switch(d){
                case 1:
                    document.getElementById("resultado_dia").textContent="Lunes ";
                break;
                case 2:
                    document.getElementById("resultado_dia").textContent="Martes ";
                break;
                case 3:
                    document.getElementById("resultado_dia").textContent="Miercoles ";
                break;
                case 4:
                    document.getElementById("resultado_dia").textContent="Jueves ";
                break;
                case 5:
                    document.getElementById("resultado_dia").textContent="Viernes ";
                break;
            }
            document.getElementById("resultado_laboral").textContent="día laboral ";
        }else{
            switch (d){
                case 0:
                    document.getElementById("resultado_dia").textContent="Domingo ";
                break;
                case 6:
                    document.getElementById("resultado_dia").textContent="Sábado ";
                break;

            }
            document.getElementById("resultado_laboral").textContent="día no laboral ";
        }
    }else{
        document.getElementById("resultado_dia").textContent="El día no coincide con el mes ";
    }
}

/**
 * Valida si una fecha dada es válida correspondiendo al día con el año
 * @param {number} dia Día ingresado
 * @param {number} mes Mes ingresado
 * @param {number} ano Año ingresado
 * @returns {boolean} Validador de fehca correcta o no
 */
function valorValido(dia, mes, ano){
    switch(mes){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            if(!(dia<=31)){
                return false;
            }else{
                return true;
            }
        break;

        case 4:
        case 6:
        case 9:
        case 11:
            if(!(dia<=30)){
                return false;
            }else{
                return true;;
            }
        break;

        case 2:
            if(esBisiesto(mes)){
                if(!(dia<=29)){
                    return false;
                }
            }else{
                if(!(dia<=28)){
                    return false;
                }
            }
    }
}

/**
 * 
 * @param {number} ano_V Recibe un numero en año y regresa si es Bisiesto
 * @returns {boolean} Validador de año bisiesto
 */
function esBisiesto(ano_V){
    if(ano_V%4==0){
        if(ano_V%100==0){
            if(ano_V%400==0){
                return true;
            }else{
                return false;
            }
        }else{
            return true;
        }
    }else{
        return false;
    }
}

/**
 * Esta función recibe año y mes, en respuesta calcula la constante que se utilizará para 
 * ingresar en la fórmula del día laboralo o no laboral
 * @param {number} ano Año ingresado
 * @param {number} mes mes ingresado
 * @returns {number} Regresa la constante de mes
 */
function constanteMes(ano, mes){
    switch (mes){
        case 1:
            if(esBisiesto(ano)){
                return 6;
            }else{
                return 0;
            }
        break;

        case 2:
            if(esBisiesto(ano)){
                return 2;
            }else{
                return 3;
            }
        break;

        case 3:
        case 11:
            return 3;
        break;

        case 4:
        case 7:
            return 6;
        break;

        case 5:
            return 1;
        break;

        case 6: 
            return 4;
        break;

        case 8:
            return 2;
        break;

        case 9:
        case 12:
            return 5;
        break;

        case 10:
            return 0;
        break;
    }
}

/**
 * Existe una periodicidad de 400 años que oscila entre 0, 2, 4 y 6 que hacen mancuerna con el año que se ingresa, 
 * detemrinar la constante es importante para hacer un cálculo preciso del día laboral o no laboral
 * @param {number} ano_evaluar 
 * @returns {boolean} Regresa la constante de periodicidad que utiliza la fórmula para calcular el día 
 * que cae una fecha determinada
 */
function constanteK(ano_evaluar){
    let ano=0;
    let valor=6;

    while(!(ano_evaluar>=ano && ano_evaluar<=ano+99)){
        if(valor!=0){
            valor-=2;
        }else{
            valor=6;
        }
        ano+=100;
    }
    return valor;
}