const {suma, resta, multiplica, divide} = require ("./calculos");

const areaCuadradro = (lado) => multiplica (lado,lado);

const AreaRectangulo = (base,altura) => multiplica (base,altura);

module.exports = {areaCuadradro, AreaRectangulo};
