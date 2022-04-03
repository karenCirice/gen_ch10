const calculo = require ("../calculos");
const area = require("../areas");

// //destructurar
// const {suma, resta, multiplica, divide} = require("../calculos");


test('Debería sumar dos números positivos', () => {
    const operacion = calculo.suma(1, 3); // paso de parametros a la funcion de suma
    expect(operacion).toBe(4);
});

test('Debería sumar dos números negativos', () => {
    const operacion = calculo.suma(-4, -10); // paso de parametros a la funcion de suma
    expect(operacion).toBe(-14);
});

test('Debería restar dos números positivos', () => {
    const operacion = calculo.resta(10, 3); // paso de parametros a la funcion de suma
    expect(operacion).toBe(7);
});

test('Debería restar dos números negativos', () => {
    const operacion = calculo.resta(-4, -10); // paso de parametros a la funcion de suma
    expect(operacion).toBe(6);
});

test('Debería devolver el area de un cuadrado', () => {
    expect(area.areaCuadrado(3)).toBe(9);
});

test('Debería devolver el area de un rectangulo', () => {
    expect(area.areaRectangulo(3, 6)).toBe(18);
});