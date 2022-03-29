//const { TestWatcher } = require("jest");

const calculo = require("../calculos");
const area = require("../areas");

const {suma, resta, multiplica, divide} = require ("../calculos") // con esot puedes llamar de la manera como esta en multiplica

//[a, b, c] = [ 10, 20, 50];
//{a, b, c} = {obja, objb, objc}

//SUMA

test("Deberia de sumar dos numeros positivos", () => {
  const operacion = calculo.suma (1, 3); //Paso para parametros de la funcion suma
  expect (operacion).toBe(4) //toBe es lo que espero
});

test ("Deberia sumar dos numeros negativos", () =>{
    const  operacion = calculo.suma (-4, -10);
    expect(operacion).toBe(-14);
});

//RESTA

test("Deberia de restar dos numeros positivos", () => {
    const operacion = calculo.resta (10, 3); //Paso para parametros de la funcion suma
    expect (operacion).toBe(7); //toBe es lo que espero
  });
  
  test ("Deberia restar dos numeros negativos", () =>{
      const  operacion = calculo.resta (-4, -10);
      expect(operacion).toBe(6);
  });

//Multiplicacion

  
  test ("Deberia multiplicar dos numeros positivos", () =>{
      const  operacion = multiplica (10, 3);
      expect(operacion).toBe(30);
  });