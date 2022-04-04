const calculo = require("../calculos");

test("Deberia sumar dos números positivos",()=>{
    const operacion = calculo.suma(1,3); // Paso parámetros a la funcion suma
    expect(operacion).toBe(4);
});

test("Deberia sumar dos números negativos",()=>{
    const operacion = calculo.suma(-4,-10); // Paso parámetros a la funcion suma
    expect(operacion).toBe(-14);
});

test("Deberia restar dos números positivos",()=>{
    const operacion = calculo.resta(10,3); // Paso parámetros a la funcion suma
    expect(operacion).toBe(7);
});

test("Deberia restar dos números negativos",()=>{
    const operacion = calculo.resta(-4,-10); // Paso parámetros a la funcion suma
    expect(operacion).toBe(6);
});