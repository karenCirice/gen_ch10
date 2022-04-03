const {suma, resta, multiplica, divide} = require ("./calculos");


const areaCuadrado = (lado) => multiplica (lado, lado);

const areaRectangulo = (base, altura) => multiplica (base, altura);

module.exports = {areaCuadrado, areaRectangulo};