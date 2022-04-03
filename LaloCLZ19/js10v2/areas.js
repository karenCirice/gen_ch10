const {suma, resta, mult, divide} = require ("./calculos");

const areaCuadrado = (lado) => mult (lado, lado);
const areaRectangulo = (base, altura) => mult (base, altura);

module.exports = {areaCuadrado, areaRectangulo};