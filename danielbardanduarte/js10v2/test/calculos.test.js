
const calculo = require ("../calculos");

test ("Deberia sumar dos numeros positivos", ()=>{
    const operacion = calculo.suma(1 , 3); //Paso parametros a la funcion suma
    expect(operacion).toBe(4);
});

test ("Deberia sumar dos numeros negativos", ()=>{
    const operacion = calculo.suma(-4,-10);
    expect(operacion).toBe(-14);
});

test ("Deberia restar dos numeros positivos", ()=>{
    const operacion = calculo.resta(10 , 3); //Paso parametros a la funcion suma
    expect(operacion).toBe(7);
});

test ("Deberia sumar dos numeros negativos", ()=>{
    const operacion = calculo.resta(-4,-10);
    expect(operacion).toBe(6);
});