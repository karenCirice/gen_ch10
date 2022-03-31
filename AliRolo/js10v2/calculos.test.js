
const { expect } = require("@jest/globals");
const calculo = require ("./calculos");
const areas = require ("./areas");

test ("Debería sumar dos números positivos", ()=>{
    const operacion = calculo.suma(1,3); //Paso parámetros a la función suma
    expect(operacion).toBe(4);
});

test("Debería sumar dos números negativos", ()=> {
    const operación = calculo.suma (-4, -10);
    expect(operación).toBe(-14);
});

test ("Debería restar dos números positivos", ()=>{
    const operacion = calculo.resta(3,1); //Paso parámetros a la función suma
    expect(operacion).toBe(2);
});

test("Debería restar dos números negativos", ()=> {
    const operación = calculo.resta (-4, -10);
    expect(operación).toBe(6);
});

test ("Debería multiplicar dos números positivos", ()=>{
    const operacion = calculo.multiplica(1,3); //Paso parámetros a la función suma
    expect(operacion).toBe(3);
});

test("Debería multiplicar dos números negativos", ()=> {
    const operación = calculo.multiplica (-4, -10);
    expect(operación).toBe(40);
});

test("Debería dividir dos números positivos", ()=> {
    const operación = calculo.divide (40, 4);
    expect(operación).toBe(10);
});

test("Debería dividir dos números negativos", ()=> {
    const operación = calculo.divide (-40, -10);
    expect(operación).toBe(4);
});

test ("Debería obtener el área de un cuadrado", ()=>{
    const operacion = areas.areaCuadrado(10);
    expect(operacion).toBe(100);
})