//const { TestWatcher } = require("jest");
const calculo = require("../calculos");
const area = require("../areas");
const {suma,resta,multiplica,division} = require("../calculos");

test("deberia de sumar dos numeros positivos", ()=> {
    const operacion = calculo.suma(2,3);
    expect(operacion).toBe(5);
})

test("deberia de sumar dos numeros negativos", ()=> {
    const operacion = calculo.suma(-2,-3);
    expect(operacion).toBe(-5);
})

test("deberia de restar dos numeros positivos", ()=> {
    const operacion = calculo.resta(2,3);
    expect(operacion).toBe(-1);
})

test("deberia de restar dos numeros negativos", ()=> {
    const operacion = calculo.resta(-2,-3);
    expect(operacion).toBe(1);
})

test("deberia de multiplicar dos numeros positivos", ()=> {
    const operacion = multiplica(2,3);
    expect(operacion).toBe(6);
})

test("deberia de dividir dos numeros negativos", ()=> {
    const operacion = division(6,2);
    expect(operacion).toBe(3);
})

test("deberia obtener el area de un cuadrado", ()=> {
    const operacion = area.areaCuadrado(10);
    expect(operacion).toBe(100);
})

test("deberia obtener el area de un rectangulo", ()=> {
    const operacion = area.areaRectangulo(10,10);
    expect(operacion).toBe(100);
})