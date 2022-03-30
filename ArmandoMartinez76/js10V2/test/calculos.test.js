const calculos = require ('../calculos');
const {sumar, resta, multiplica, divide} = require('../calculos');
const area = zrequire ('../area');


test ("Deberia sumar dos numeros positivos", () => {
    const operacion = calculos.sumar(2 , 2);
    expect(operacion).toBe(4);
})
    

test ("Deberia sumar dos numeros negativos", () => {
    const operacion = calculos.sumar(-2 ,-2);
    expect(operacion).toBe(-4);
})

test ("Deberia sumar dos numeros positivos", () => {
    const operacion = calculos.resta(2 , 2);
    expect(operacion).toBe(4);
})
    

test ("Deberia restar dos numeros negativos", () => {
    const operacion = calculos.resta(-2,-2);
    expect(operacion).toBe(-4);
})

test ("Deberia multiplicar dos numeros negativos", () => {
    const operacion = multiplica (10, 3);
    expect(operacion).toBe(30);
})

test ("Deberia obtener el area de un cuadrado", () => {
    const operacion = area.areaCuadrado(10);
    expect(operacion).toBe(100)
})