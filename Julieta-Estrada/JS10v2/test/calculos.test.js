const calculo = require ("../calculos");
const area = require("../areas");
const {suma, resta, multiplica, divide} = require ("../calculos")

//[a , b ,c] = [10 , 20, 50];
//{a , b , c} = { obja, objb, objc}

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
    const operacion = multiplica  (10 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(30);
} );

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