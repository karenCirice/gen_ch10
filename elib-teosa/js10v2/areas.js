const {suma, resta, multiplica, divide} = require("./calculos")

const areaCuadrado = (lado) => multiplica(lado, lado);
const areaRectangulo = (b, h) => multiplica(b, h);

module.exports = {areaCuadrado, areaRectangulo};