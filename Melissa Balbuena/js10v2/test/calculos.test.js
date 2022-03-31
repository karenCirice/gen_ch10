//const { TestWatcher } = require("jest");

const calculo = require("../calculos");
const area = require("../areas");

// con esot puedes llamar de la manera como esta en multiplica y divide
const { suma, resta, multiplica, divide } = require("../calculos");

// con esot puedes llamar de la manera como esta en areaParalelogramo
const { areaCuadrado, areaRectangulo, areaParelelogramo, areaRombo } = require("../areas");

//[a, b, c] = [ 10, 20, 50];
//{a, b, c} = {obja, objb, objc}

//SUMA POSITIVO
test("Deberia de sumar dos numeros positivos", () => {
  const operacion = calculo.suma(1, 3); //Paso para parametros de la funcion suma
  expect(operacion).toBe(4); //toBe es lo que espero
});

//SUMA NEGATIVO
test("Deberia sumar dos numeros negativos", () => {
  const operacion = calculo.suma(-4, -10);
  expect(operacion).toBe(-14);
});

//RESTA POSITIVO
test("Deberia de restar dos numeros positivos", () => {
  const operacion = calculo.resta(10, 3);
  expect(operacion).toBe(7); //toBe es lo que espero
});

//RESTA NEGATIVO
test("Deberia restar dos numeros negativos", () => {
  const operacion = calculo.resta(-4, -10);
  expect(operacion).toBe(6);
});

//MuULTIPLICACION POSITIVO
test("Deberia multiplicar dos numeros positivos", () => {
  const operacion = multiplica(10, 3);
  expect(operacion).toBe(30);
});

//MULTIPLICACION NEGATIVO
test("Deberia dividir dos numeros positivos", () => {
  const operacion = divide(9, 3);
  expect(operacion).toBe(3);
});

// AREA DE UN CUADRADO
test("Deberia dar el area de un cuadrado", () => {
  const operacion = area.areaCuadrado(10);
  expect(operacion).toBe(100);
});

// AREA DE UN RECTANGULO
test("Deberia dar el area de un rectangulo", () => {
  const operacion = area.areaRectangulo(10, 3);
  expect(operacion).toBe(30);
});

// AREA DE UN PARALELOGRAMO
test("Deberia dar el area de un paralelogramo", () => {
  const operacion = areaParelelogramo(7, 4);
  expect(operacion).toBe(28);
});

// AREA DE UN ROMBO
test("Deberia dar el area de un rombo", () => {
  const operacion = areaRombo(9);
  expect(operacion).toBe(81);
});
