const calculo = require ("../calculos");
const area = require ("../areas");
const {areaCuadrado, areaRentangulo} = require ("../areas")
const {suma, resta, multiplicar ,dividir} = require ("../calculos");


test ("Debería sumar dos números positivos",()=>{
    const operacion = calculo.suma (1 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(4);
});

test ("Debería sumar dos números negativos",()=> {
    const operacion = calculo.suma (-4, - 10);
    expect(operacion).toBe(-14);
});

test ("Debería restar dos números positivos",()=>{
    const operacion = calculo.resta (10 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(7);
});

test ("Debería restar dos números negativos",()=> {
    const operacion = calculo.resta (-4, - 10);
    expect(operacion).toBe(6);
});

test ("Debería multiplicar dos números positivos",()=>{
    const operacion = calculo.multiplicar (2 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(6);
});

test ("Debería multiplicar dos números negativos",()=> {
    const operacion = calculo.multiplicar (-2, - 13);
    expect(operacion).toBe(26);
});

test ("Debería dividir dos números positivos",()=>{
    const operacion = calculo.dividir (40 , 2); //Paso parámetros a la función suma
    expect(operacion).toBe(20);
});

test ("Debería dividir dos números negativos",()=> {
    const operacion = calculo.dividir (-10, -5);
    expect(operacion).toBe(2);
});

test ("Deberia obtener el área de un cuadrado",()=> {
    const operacion = area.areaCuadrado(10)
    expect(operacion).toBe(100);
})
test ("Debe obtener el área de un rentangulo",()=> {
    const operacion = area.areaRentangulo(10,5)
    expect(operacion).toBe(50)
})
