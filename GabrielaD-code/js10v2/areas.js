const {suma,resta,producto,division} = require("./calculos");

const areaCuadrado = (lado) => producto(lado,lado);
const areaRectangulo = (base,altura) => producto (base,altura);

module.exports = {areaCuadrado,areaRectangulo};

