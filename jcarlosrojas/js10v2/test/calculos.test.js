
const calculo = require ("../calculos");
const area = require("../areas");
const {suma, resta, multiplica, divide} = require("../calculos");

test ("Deberia sumas dos numeros positivos", () => {
    const operacion = calculo.suma (1, 3); //Paso parametros a la funcion suma
    expect(operacion).toBe(4);
});

test ("Deberia sumar dos numeros negativos", () => {
    const operacion = calculo.suma(-4, -10);
    expect(operacion).toBe(-14);
});

test ("Deberia obtener el area de un cuadrado", () => {
    const operacion = area.areaCuadrado(5,5);
    expect(operacion).toBe(25);
});