const calculo = require ("../calculos");

test ("deberia sumar dos numeros positivos", () =>{
    const operacion = calculo.suma (1, 3); // paso parametros a la funcion suma
    expect(operacion.toBe(4));
});

test("deberia sumar dos numeros negativos", () =>{
    const operacion = calculo.suma (-4, 10);
    expect(operacion).toBe(4);
});

test("debderia restar dos numeros positivos", () =>{
    const operacion = calculo.suma (10, 3);
    expect(operacion).toBe(7);
});

test("deberia restar dos numeros negativos", () =>{
    const operacion = calculo.suma (-4, -10);
    expect(operacion).toBe(6);
});
test("deberia multiplicar dos numeros negativos", () =>{
});
test("deberia obtener el area de un cuadrado", () =>{
    const operacion = calculo.suma (-4, -10);
    expect(operacion).toBe(6);
});