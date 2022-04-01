const {suma, resta, multiplica, divide} = requiere ("./calculos.js")

const areaCuadrado = (lado) => multiplica (lado, lado);
const areaRectangulo = (lado) => multiplica (base, lado);

module.exports = {areaCuadrado, areaRectangulo};