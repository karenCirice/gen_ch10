
const area = require ("../areas");
const {suma, resta, multiplica, divide} = require ("../calculos")

//Paso parámetros a la función suma
test ("Deberia sumar dos números positivos", ()=>{ 
    const operacion = suma (1, 3);
    expect(operacion).toBe(4);
});

test ("Deberia sumar dos números negativos", ()=>{
    const operacion = suma (-4,-10);
    expect(operacion).toBe(-14);
});

test ("Deberia restar dos números positivos", ()=>{
    const operacion = resta (10, 3);
    expect(operacion).toBe(7);
});

test ("Deberia restar dos números negativos", ()=>{
    const operacion = resta (-4,-10);
    expect(operacion).toBe(6);
});

test ("Deberia multiplicar dos números positivos", ()=>{
    const operacion = multiplica (10, 3);
    expect(operacion).toBe(30);
});

test ("Deberia obtener el área de un cuadrado", ()=>{
    const operacion = area.areaCuadrado (10);
    expect(operacion).toBe(100);
});
