const {suma, resta, multiplica, divide} = require ("./calculos");


const areaCuadrado = (lado) => multiplica (lado,lado);

const areaRectangulo = (base, altura) => multiplica (base, altura);

const areaTriangulo = (areaRectangulo) => divide (areaRectangulo, 2)

module.exports = {areaCuadrado, areaRectangulo, areaTriangulo}; 

