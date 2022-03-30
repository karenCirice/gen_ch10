const {suma, resta, multiplica, divide} = require("./calculos")
const pi = Math.PI;

const areaCuadrado = (lado) => multiplica (lado,lado);

const areaRectangulo =(base,altura) => multiplica(base,altura);

const areaTriangulo = (base,altura) => (multiplica(base,altura))/2;

const areaCirculo = (radio) => (multiplica(radio,radio))*pi;

module.exports = {areaCuadrado,areaRectangulo, areaTriangulo, areaCirculo};