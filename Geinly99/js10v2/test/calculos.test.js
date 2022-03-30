const calculo = require ("../calculos");
const area = require ("../area")

test ("Debería sumar dos números positivos", () =>{
    const operacion = calculo.suma (1,3); //paso parámetros a la función suma
    expect(operacion).toBe(4);
});
test ("Debería sumar dos números negativos", () =>{
    const operacion = calculo.suma (-4,-10); //paso parámetros a la función suma
    expect(operacion).toBe(-14);
});
test ("Debería restar dos números positivos", () =>{
    const operacion = calculo.resta (15,5); //paso parámetros a la función suma
    expect(operacion).toBe(10);
});
test ("Debería restar dos números negativos", () =>{
    const operacion = calculo.resta (-4,-10); //paso parámetros a la función suma
    expect(operacion).toBe(6);
});
test ("Debería multiplicar dos números positivos", () =>{
    const operacion = calculo.multiplica (4,15); //paso parámetros a la función suma
    expect(operacion).toBe(60);
});
test ("Debería obtener el área de un cuadrado", () =>{
    const operacion = area.areaCuadrado(10); //paso parámetros a la función suma
    expect(operacion).toBe(100);
});
test ("Debería obtener el área de un rectángulo", () =>{
    const operacion = area.areaRectangulo(10,15); //paso parámetros a la función suma
    expect(operacion).toBe(150);
});
