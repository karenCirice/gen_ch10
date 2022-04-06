const {suma ,resta, multiplicar, dividir} = require("./calculos")

const areaCuadrado = (lado) => multiplicar (lado,lado)

const areaRentangulo = (base,altura) => multiplicar (base,altura)

module.exports = {areaCuadrado, areaRentangulo}