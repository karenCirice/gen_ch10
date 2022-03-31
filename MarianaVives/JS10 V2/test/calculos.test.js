// Para desestructurizar:
// const {suma, resta, multiplica, divide} = require ("../calculos")

// const { expect } = require("@jest/globals");
const calculo = require("../calculos");
const area = require("../areas");
const {suma, resta, multiplica, divide} = require ("../calculos")


test("Debería sumar dos números positivos", () => {
    const operacion = calculo.suma(1, 3); // Paso parámetros a la función suma
    expect(operacion).toBe(4);
});

test("Debería sumar dos números negativos", () => {
    const operacion = calculo.suma(-1, -3);
    expect(operacion).toBe(-4);
});

test("Debería de restar dos números positivos", () => {
    const operacion = calculo.resta(4, 2); // Paso parametros a la función resta
    expect(operacion).toBe(2);
});

test("Debería de restar dos números negativos", () => {
    const operacion = calculo.resta(-4, -10);
    expect(operacion).toBe(6);
});

test("Debería multiplicar dos números positivos", () => {
    const operacion = calculo.multiplica(10, 3);
    expect(operacion).toBe(30);
});

test("Debería multiplicar dos números negativos", () => {
    const operacion = calculo.multiplica(-10, -3);
    expect(operacion).toBe(30);
});

test("Debería dividir dos números positivos", () => {
    const operacion = calculo.divide(12, 6);
    expect(operacion).toBe(2);
});

test("Debería dividir dos números negativos", () => {
    const operacion = calculo.divide(-9, -3);
    expect(operacion).toBe(3);
});

test("Debería obtener el area de un cuadrado", ()=> {
    const operacion = area.areaCuadrado(10);
    expect(operacion).toBe(100);
});

test("Debería obtener el área de un rectángulo", () =>{
    const operacion = area.areaRectangulo(6,2);
    expect(operacion).toBe(12);
});