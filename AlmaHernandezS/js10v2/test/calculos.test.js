const calculo = require ("../calculos");
const { areaCuadrado, areaRectangulo } = require("./areas");

test ("Deberia sumar dos números positivos", ()=> {
    const operacion = calculo.suma(1 , 3);
    expect(operacion).toBe(4);
});

test ("Deberia sumar dos números negativos", ()=> {
    const operacion =calculo.suma(-4, -10);
    expect(operacion).toBe(-14);
})

test ("Deberia restar dos números positivos", ()=> {
    const operacion = calculo.resta(10 , 3);
    expect(operacion).toBe(7);
});

test ("Deberia restar dos números negativos", ()=> {
    const operacion = calculo.resta(-4 , -10);
    expect(operacion).toBe(6);
});

test ("Deberia obtener el area de un cuadrado", ()=> {
    const operacion = areaCuadrado(10);
    expect(operacion).toBe(100);
});

test ("Deberia obtener el area de un rectangulo", ()=> {
    const operacion = areaRectangulo(5, 5);
    expect(operacion).toBe(25);
});