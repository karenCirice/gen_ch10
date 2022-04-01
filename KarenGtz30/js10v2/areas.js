const {suma, resta, multiplica, divide} = require ("./calculos");

const areaCuadrado = (lado) => multiplica (lado, lado);

const areaRectangulo = (base, altura) => multiplica (base, altura);

const areaTriangulo = (base, altura) => multiplica (base, altura) / 2;

module.exports = {areaCuadrado, areaRectangulo, areaTriangulo};