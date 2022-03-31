 const calculo = require("../calculos");
const areaCuadrado = require("../areas");
const areaRectangulo = require("../areas");
const {suma, resta, multiplica, divide} = require ("../calculos");



test ("Debería sumar dos números positivos", ()=>{
    const operacion = calculo.suma (1 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(4);
} );

test ("Debería sumar dos números negativos", ()=> {
    const operacion = calculo.suma (-4, - 10);
    expect(operacion).toBe(-14);
});

test ("Debería restar dos números positivos", ()=>{
    const operacion = calculo.resta (10 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(7);
} );

test ("Debería restar dos números negativos", ()=> {
    const operacion = calculo.resta(-4, - 10);
    expect(operacion).toBe(6);
});

test ("Debería multiplicar dos números positivos", ()=>{
    const operacion =calculo.multiplica  (10 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(30);
} );
test ("Debería  obtener area cuadrado", ()=>{
    const operacion = areaCuadrado.areaCuadrado (10,10); //Paso parámetros a la función suma
    expect(operacion).toBe(100);
} );

test ("Debería  obtener area rectangulo", ()=>{
    const operacion =areaRectangulo.areaRectangulo  (10, 15); //Paso parámetros a la función suma
    expect(operacion).toBe(150);
} );