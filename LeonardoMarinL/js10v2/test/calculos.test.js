
const calculo = require("../calculos");
const {suma, resta, multiplica, divide} =require("../calculos");
const area = require("../area");

test ("Debería sumar dos números positivos", () =>{
    const operacion = calculo.suma(1,3); //parámetros función suma
    expect(operacion).toBe(4);
});

test ("Debería sumar dos números negativos", () =>{
    const operacion = calculo.suma(-4,-10);
    expect(operacion).toBe(-14);
});

test ("Debería restar dos números positivos", () =>{
    const operacion = calculo.resta(10,3); //parámetros función resta
    expect(operacion).toBe(7);
});

test ("Debería restar dos números negativos", () =>{
    const operacion = calculo.resta(-4,-10);
    expect(operacion).toBe(6);
});

test ("Debería multiplicar dos números positivos", () =>{
    const operacion = multiplica(10,3);
    expect(operacion).toBe(30);
});

test ("Debería obtener el área de un cuadrado", () => {
    const operacion = area.areaCuadrado(10); //parámetros a función área cuadrado
    expect(operacion).toBe(100);
});

test ("Debería obtener el área de un rectángulo", () => {
    const operacion = area.areaRectangulo(20,10); //parámetros a función área cuadrado
    expect(operacion).toBe(200);
});

test ("Debería obtener el área de un triángulo", () => {
    const operacion = area.areaTriangulo(20,10); //parámetros a función área cuadrado
    expect(operacion).toBe(100);
}); //en divisiones se recomienda usar el matcher toBeCloseTo(0.3) para aumentar el número de decimales que puedan salir 

test ("Debería obtener el área de un circulo", () => {
    const operacion = area.areaCirculo(10); //parámetros a función área cuadrado
    expect(operacion).toBeCloseTo(314.15926);
});
