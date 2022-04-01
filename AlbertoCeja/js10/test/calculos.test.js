const calculo = requiere("../calculos");
const area = requiere("../areas");
const {suma, resta, multiplica, divide} = requiere("../calculos")

test ("Debería sumar dos números positivos: ", ()=> {
    const operacion = calculo.suma(4, 10);
    expect (operacion).toBe(14);
} );

test ("Debería restar dos números negativos: ", ()=> {
    const operacion = calculo.suma(-4, -10);
    expect (operacion).toBe(-14);
} );

test ("Debería restar dos números positivos: ", ()=> {
    const operacion = calculo.suma(10, 3);
    expect (operacion).toBe(7);
} );

test ("Debería restar dos números negativos: ", ()=> {
    const operacion = calculo.suma(-10, -3);
    expect (operacion).toBe(-13);
} );

test ("Debería obtener el área del cuadrado: ", ()=> {
    const operacion = area.areaCuadrado(10);
    expect (operacion).toBe(100);
} );