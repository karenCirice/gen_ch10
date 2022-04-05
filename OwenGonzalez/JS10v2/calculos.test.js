const calculo = require ("./calculos");

test ("Debería sumar dos números positivos", ()=>{
    const operacion = calculo.suma (1 , 3); //Paso parámetros a la función suma
    expect(operacion).toBe(4);
} );

test ("Debería sumar dos números negativos", ()=> {
    const operacion = calculo.suma (-4, - 10);
    expect(operacion).toBe(-14);
});
test('Deberia sumar dos numeros decimales', () => {
    const value = 0.1 + 0.2;
    //expect(value).toBe(0.3);           This won't work because of rounding error
    expect(value).toBeCloseTo(0.3); // Se susa toBeClose para numeros decimales
  });
  test('Deberia dividir dos numeros positivos', () => {
    const operacion = calculo.divide (10, 3);
    //expect(value).toBe(0.3);           This won't work because of rounding error
    expect(operacion).toBeCloseTo(3.3333333333333335); // Se susa toBeClose para numeros decimales
  });