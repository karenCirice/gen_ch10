
const calculo = require ("../calculos");
const areas = require ("../areas")

test ("Debería sumar dos números positivos", () => {
    const operacion = calculo.suma(1, 3); //Paso aprametros de la función suma
    expect(operacion).toBe(4);
} );

test ("Debería sumar dos números negativo", () => {
    const operacion = calculo.suma(-4, -10); //Paso aprametros de la función suma
    expect(operacion).toBe(-14);
} );

test ("Debería obtener el area de un cuadrado", () => {
    const operacion = areas.areaCuadrado(10); //Paso aprametros de la función suma
    expect(operacion).toBe(100);
} );