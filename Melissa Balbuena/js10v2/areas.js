const { suma, resta, multiplica, divide } = require("./calculos");

const areaCuadrado = (lado) => multiplica(lado, lado);

const areaRectangulo = (base, altura) => multiplica(base, altura);

const areaParelelogramo = (base, hipotenusa) => multiplica(base, hipotenusa);

const areaRombo = (diagonal) => multiplica(diagonal, diagonal);

module.exports = { areaCuadrado, areaRectangulo, areaParelelogramo, areaRombo };
