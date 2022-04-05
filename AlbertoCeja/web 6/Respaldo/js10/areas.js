const {suma, resta, multiplica, divide} = requiere("./calculos");

const areaCuadrado = (lado) => multiplica (lado, lado);
const areaRectangulo = (base,altura) => multiplica(base,altura);

module.exports = {areaCuadrado, areaRectangulo};
