/* ARCHIVO PARA REALIZAR LOS TESTEOS */
/* AQUÍ SE LLAMAN LAS CONSTANTES OBJ, ETC, LO CUAL SE REALIZA CON REQUIRE COMO SE INDICA ABAJO */
const calculo = require ("../calculos");  /* Se manda llamar el archivo JS, con cada punta se va hacia atrás de la carpeta en la que se encuentra */
const area = require ("../areas") /* Se llama al JS para tomar la operación */
const {suma, resta, multiplica, divide} = require ("../calculos") /* Se llama (Importa) */


test ("Debería sumar dos números positivos", () => {
    const operacion = calculo.suma (1, 3); //Se agrega la operación de suma
    expect(operacion).toBe(4);
});

test("Debería sumar dos números negativos", () => {
    const operacion = calculo.suma (-4, -10);
    expect(operacion).toBe(-14);
});

test ("Debería restar dos números positivos", () => {
    const operacion = calculo.resta (6, 3); //Se agrega la operación de suma
    expect(operacion).toBe(3);
});

test("Debería restar dos números negativos", () => {
    const operacion = calculo.resta (4, 10);
    expect(operacion).toBe(-6);
});

test ("Debería obtener el área de un cuadrado", () => {
    const operacion = area.areaCuadrado(10); // como está descrito en areas.js 10 = lado
    expect(operacion).toBe(100);
})

test ("Debería obtener el área de un rectangulo", () => {
    const operacion = area.areaRectangulo(10,5); // como está descrito en areas.js 10 = lado
    expect(operacion).toBe(50);
})

/* LAS CONSTANTES LAS TOMAMOS IMPORTANDO LA INFORMACION DE OTROS ARCHIVOS, EN LOS CUALES SE ENCUENTRAN ESAS CONSTANTES */
/* TEST ES FIJO, Y EMPLEA LAS CONSTANTES Y FUNCIONES USADAS EN LOS ARCHIVOS ORIGINALES, ESTE DOCUMENTO ES DE PURAS PRUEBAS, EN EL CUAL LLAMAS A LOS OBJETOS DE LOS ARCHIVOS ORIGINALES*/

/* Para obtener las carpetas de node_modules y los package, usamos GitBash y empleamos npm install jest, dentro de la carpeta donde estarás trabajando. */
/* Para realizar la prueba, en GitBash vamos a utilizar npm run test, el cual se irá actualizanco al momento de corregir o editar tu código */