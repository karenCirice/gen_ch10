const calculo = require ("../calculos");

test ("Debería sumar dos números positivos",()=>{
    const operacion = calculo.suma (1, 3);
    expect(operacion).toBe(4)
})

test ("Debería sumar dos números negativos",()=>{
    const operacion = calculo.suma (-4, -10);
    expect(operacion).toBe(-14)
})

test ("Debería restar dos números pisitivos",()=>{
    const operacion = calculo.resta (10, 3);
    expect(operacion).toBe(7)
})

test ("Debería restar dos números negativos",()=>{
    const operacion = calculo.resta (-4, -10);
    expect(operacion).toBe(6)
})