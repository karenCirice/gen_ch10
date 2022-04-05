const calculo = require ("../calculos"); //ponemos .. porque la carpeta no esta sobre el mismo nivel esta dentro e otra carpeta que se llama test en color turquesa

const area = require ("../areas");


test ("debería sumar dos números positivos", () =>{
    const operacion = calculo.suma (1 , 3); // paso parámetros a la función suma 
    expect (operacion).toBe(4);
});

test ("Deberia sumar dos números negativos", () =>{
    const operacion = calculo.suma (-4, -10);
    expect(operacion).toBe(-14);
});

test ("Deberia restar dos números positivos", () =>{
    const operacion = calculo.resta (10,  3);
    expect(operacion).toBe(7);
});

test ("Deberia restar dos números negativos", () =>{
    const operacion = calculo.resta (-4, -10);
    expect(operacion).toBe(6);
});

test ("Deberia multiplicar dos números positivos", () =>{
    const operacion = multiplica (10, 3);
    expect(operacion).toBe(30);
});


test ("Debería obtener el área de un cuadrado", () =>{
    const operacion = area.areaCuadrado (10);
    expect(operacion).toBe(100);
});

//podemos hacer pruebas también en un archivo .test o .expect o .js
// para ejecutar las pruebas: en git bash uso (npm run test) 
//el expect sirve para hacer modulo de pruebas y hacer otro para áreas.


