const calculo = require ("../calculos");
const area = require ("../areas");
const {suma, resta, multiplica, divide} = require ("../calculos")

test ("Deberia sumar dos numeros positivos", ()=> {
    const operacion = calculo.suma(1,3); //Paso parametros a la funcion suma
    expect(operacion).toBe(4);
});

test ("Deberia sumar don numeros negativos", ()=> {
    const operacion = calculo.suma(-4,-10);
    expect(operacion).toBe(-14);
});

test ("Deberia restar don numeros positivos", ()=> {
    const operacion = calculo.resta(10,3);
    expect(operacion).toBe(7);
});

test ("Deberia restar don numeros negativos", ()=> {
    const operacion = calculo.resta(-4,-10);
    expect(operacion).toBe(6);
});

test ("Deberia multiplicar don numeros positivos", ()=> {
    const operacion = multiplica(10,3);
    expect(operacion).toBe(30);
});

test ("Deberia obtener el area de un cuadrado", ()=> {
    const operacion = area.areaCuadrado(10);
    expect(operacion).toBe(100);
});

test ("Deberia obtener el area de un rectangulo", ()=> {
    const operacion = area.areaRectangulo(10,5);
    expect(operacion).toBe(50);
});

test ("Deberia obtener el area de un triangulo", ()=> {
    const operacion = area.areaTriangulo(10,5);
    expect(operacion).toBe(25);
});