const calculo = require ("../calculos");
const a = require ("../areas");
const { expect } = require("@jest/globals");

test ("Debería sumar dos números positivos",()=>{
    const operacion = calculo.suma (1, 3);
    expect(operacion).toBe(4)
})

test ("Debería sumar dos números negativos",()=>{
    const operacion = calculo.suma (-4, -10);
    expect(operacion).toBe(-14)
})

test ("Debería restar dos números pisitivos",()=>{
    const operacion = calculo.resta (10, 3);
    expect(operacion).toBe(7)
})

test ("Debería restar dos números negativos",()=>{
    const operacion = calculo.resta (-4, -10);
    expect(operacion).toBe(6)
})

test ("Debería entregar el area de un cuadrado de 5u de lado", ()=> {
    const operacion = a.areaCuadrado(5);
    expect(operacion).toBe(25)
})

test ("Deberia entregar 5 elevado al cuadrado", ()=> {
    const operacion = calculo.potencia(5, 2);
    expect(operacion).toBe(25)
})

test ("Debería entregar el area de un rectangulo de 5u por 7u", () => {
    const operacion = a.areaRectangulo(5, 7);
    expect(operacion).toBe(35)
})