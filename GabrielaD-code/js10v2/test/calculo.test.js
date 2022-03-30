const calculo = require("../calculos");
const areas = require("../areas");

// Pueba unitaria: Suma dos números positivos
test("Debería sumar dos números positivos", ()=>{
    const operacion = calculo.suma(1,3);//Paso parámetros de la función suma
    expect(operacion).toBe(4);
});

// Pueba unitaria: Suma dos números negativos
test("Debería sumar dos números negativos", ()=>{
    const operacion = calculo.suma(-2,-5);//Paso parámetros de la función suma
    expect(operacion).toBe(-7);
});

// Pueba unitaria: Resta dos números positivos
test("Debería restar dos números positivos", ()=>{
    const operacion = calculo.resta(5,3);//Paso parámetros de la función suma
    expect(operacion).toBe(2);
});

// Pueba unitaria: Resta dos números negativos
test("Debería restar dos números negativos", ()=>{
    const operacion = calculo.resta(-2,-5);//Paso parámetros de la función suma
    expect(operacion).toBe(3);
});

test("Debería obtener el área de un cuadrado", ()=>{
    const operacion = areas.areaCuadrado(10);
    expect(operacion).toBe(100);
});

test("Debería obtener el área de un rectángulo", ()=>{
    const operacion = areas.areaRectangulo(10,2);
    expect(operacion).toBe(20);
});
