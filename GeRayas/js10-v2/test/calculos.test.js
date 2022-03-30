const calculo = require("../calculos");
const area = require("../area");

test("Debería sumar 2 numeros positivos", () => {

    const operacion = calculo.suma(1, 3); //Paso parametros a la funcion suma
    expect(operacion).toBe(4)
});

test("Debería sumas 2 números negativos", () => {
    const operacion = calculo.suma(-4, -10);
    expect(operacion).toBe(-14);
});

test("Debería restar 2 numeros positivos", () => {

    const operacion = calculo.resta(3, 1); //Paso parametros a la funcion resta
    expect(operacion).toBe(2)
});

test("Debería restar 2 números negativos", () => {
    const operacion = calculo.resta(-4, -10);
    expect(operacion).toBe(6);
});

test("Debería multiplicar 2 numeros positivos", () => {

    const operacion = calculo.multiplica(3, 1); //Paso parametros a la funcion multi
    expect(operacion).toBe(3)
});

test("Debería multiplicar 2 números negativos", () => {
    const operacion = calculo.multiplica(-4, -10);
    expect(operacion).toBe(40);
});

test("Debería dividir 2 numeros positivos", () => {

    const operacion = calculo.divide(5, 1); //Paso parametros a la funcion division
    expect(operacion).toBe(5)
});

test("Debería dividir 2 números negativos", () => {
    const operacion = calculo.divide(-20, -2);
    expect(operacion).toBe(10);
});

test("Debería obtener el area de un cuadrado", () => {
    const operacion = area.areaCuadrado(10);
    expect(operacion).toBe(100);
});

test("Debería obtener el area de un rectangulo", () => {
    const operacion = area.areaRectangulo(10, 15);
    expect(operacion).toBe(150);
});