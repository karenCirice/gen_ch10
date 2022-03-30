/* Archivo "Original" del cual vamos a copiar las constantes posteriormente, aquí es como si estuvieramos trabajando normalmente */
const {suma, resta, multiplica, divide} = require ("./calculos");


const areaCuadrado = (lado) => multiplica (lado, lado);

const areaRectangulo = (base, altura) => multiplica (base, altura);

module.exports = {areaCuadrado, areaRectangulo}; /* Sirve para poder llamarlos en otro JS */

/* ESTE ES EL ARCHIVO ORIGINAL, SE COLOCA EL MODULE.EXPORTS PARA PODER LLAMAR EN EL ARCHIVO DE TESTEO */
