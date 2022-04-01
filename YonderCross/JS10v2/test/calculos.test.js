const calculo = require("../calculos");
const area = require("../areas");

test ("Debería sumar dos números positivos", ()=>{
    const operacion = calculo.suma(1,3); // Paso parametros a la función suma
    expect (operacion).toBe(4)
});

test("Debería sumar dos números negativos", ()=>{
    const operacion = calculo.suma (-1,-3);
    expect(operacion).toBe(-4);
});

test("Debería restar dos números positivos", ()=>{
    const operacion = calculo.resta (1,3);
    expect(operacion).toBe(-2);
});

test("Debería restar dos números negativos", ()=>{
    const operacion = calculo.resta (-1,-3);
    expect(operacion).toBe(2);
});

test("Debería sacar el area de un cuadrado", ()=>{
    const operacion = area.cuadrado(4);
    expect(operacion).toBe(16);
});

test("Debería sacar el area de un rectangulo", ()=>{
    const operacion = area.rectangulo(4,6);
    expect(operacion).toBe(24);
});

test("Debería sacar el area de un triangulo", ()=>{
    const operacion = area.triangulo(4,8);
    expect(operacion).toBe(16);
});