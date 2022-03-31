// se manda llamar al archivo.js donde estan los calculos
const calculo = require ("./calculos");
const area = require("./areas");
const {suma, resta, multiplica, divide} = require ("./calculos");

test ("Debería sumar dos números positivos", ()=>{
    const operacion = calculo.suma (1 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(4);
} );

test ("Debería sumar dos números negativos", ()=> {
    const operacion = calculo.suma (-4, - 10);
    expect(operacion).toBe(-14);
});

test ("Debería restar dos números positivos", ()=>{
    const operacion = calculo.resta (10 , 3); //Paso parámetros a la función resta
    expect(operacion).toBe(7);
} );

test ("Debería restar dos números negativos", ()=> {
    const operacion = calculo.resta(-4, - 10);
    expect(operacion).toBe(6);
});

test ("Debería multiplicar dos números positivos", ()=>{
    const operacion = multiplica  (10 , 3); 
    expect(operacion).toBe(30);
} );

test ("Debería de obtener el area de un cuadrado", ()=> {
    const operacion = area.areaCuadrado(10);
    expect(operacion).toBe(100);
});

test ("Debería de obtener el area de un rectangulo", ()=> {
    const operacion = area.areaRectangulo(5,2);
    expect(operacion).toBe(10);
});