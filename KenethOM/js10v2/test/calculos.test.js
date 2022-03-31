const calculo = require ("../calculos");
const {suma, resta, multiplica, divide} = require ("../calculos")
const area = require ("../areas");




test ("Debería sumar dos números positivos", ()=>{
    const operacion = calculo.suma (1,3); //Paso parámetros para función suma.
    expect(operacion).toBe(4);
} );

test ("Debería de sumar dos números negativos", ()=>{
    const operacion = calculo.suma(-4, -10);
    expect(operacion).toBe(-14);
});

test ("Debería restar dos números positivos", ()=>{
    const operacion = calculo.resta (1,3); //Paso parámetros para función resta.
    expect(operacion).toBe(-2);
} );

test ("Debería de restar dos números negativos", ()=>{
    const operacion = calculo.resta(-4, -10);
    expect(operacion).toBe(6);
});

test ("Debería obtener el area de un cuadrado", ()=>{
    const operacion = area.areaCuadrado(10); 
    expect(operacion).toBe(100);
} );

test ("Debería obtener el area de un rectangulo", ()=>{
    const operacion = area.areaRectangulo(15,10);
    expect(operacion).toBe(150);
} );