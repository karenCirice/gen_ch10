const calculo = require ('../calculos');
const area = require("../areas");

test("Deberia sumar dos numero positivos", () => {
    const operacion = calculo.suma(1, 3); //Paso parametros a la funcion suma
    expect(operacion).toBe(4);
});

test("Deberia sumar dos numero negativos", () => {
    const operacion = calculo.suma(-4, -10); //Paso parametros a la funcion suma
    expect(operacion).toBe(-14);
});

test("Deberias de obtener el area de un cuadrado", () => {
    const operacion = area.areaCuadrado(10);
    expect(operacion).toBe(100);
})