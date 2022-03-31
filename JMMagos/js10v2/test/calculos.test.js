//const { TestWatcher } = require("jest");
const calculo=require("../calculos");
const figuras=require("../area");
//[a, b, c]=[10, 20, 30];
//{a, b, c}={ObjetoA, ObjetoB, ObjetoC}

test ("Debería sumar dos números positivos", ()=>{
    const operacion=calculo.suma(1,3);
    expect(operacion).toBe(4)
});

test ("Debería restar dos números positivos", ()=>{
    const operacion=calculo.resta(1,3);
    expect(operacion).toBe(-2)
});

test ("Debería multiplicar dos números positivos", ()=>{
    const operacion=calculo.multiplica(1,3);
    expect(operacion).toBe(3)
});

test ("Debería dividir dos números positivos", ()=>{
    const operacion=calculo.divide(6,3);
    expect(operacion).toBe(2)
});

test('adding floating point numbers', () => {
    const operacion=calculo.divide(1, 3);
    expect(operacion).toBeCloseTo(0.3333333333); // This works.
  });

/**test cuadrado */
test('Calcula area de cuadrado', () => {
    const operacion=figuras.aCuadrado(2,2);
    expect(operacion).toBe(4); // This works.
});

/**test triangulo */
test('Calcula area de triangulo', () => {
    const operacion=figuras.aTriangulo(3, 6);
    expect(operacion).toBe(9); // This works.
});