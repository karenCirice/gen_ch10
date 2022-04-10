//vinculamos el otro js y como tenemos el documento dentro de otra carpeta colocamos doble punto(..)
const calculo = require("../calculos");
//volvemos a vincular el archivo que vamos a "testear"
const area = require("../areas");

test ("Debería sumar los números positivos", () => {
    const operacion = calculo.suma(1,3); //paso parámetros de la función suma
    expect(operacion).toBe(4);
} );

test("Deberia sumar dor números", ()=> {
    const operacion = calculo.suma (-4,-10);
    expect (operacion).toBe(-14);
});

test("Deberia restar los números positivos" , () => {
    const operacion = calculo.resta(10,3);
    expect(operacion).toBe(7);
});

test("Deberia restar los números" , () => {
    const operacion = calculo.resta(-4,-10);
    expect(operacion).toBe(6);
});

test("Deberia obtener el área de un cuadrado" , () => {
    const operacion = area.areaCuadrado(10);
    expect(operacion).toBe(100);
});