/**
 * Prueba unitaria, de la suma
 * En git bash tienes que poner el comando $ npm install jest 
 * Para descargar la blibioteca de prueba "jest"
 * Creas tu programa en un sum.js (Estas aquí mero)
 * Creas un archivo .test.js y ahí pones el formato de la prueba
 * En el archivo .json que se descarga con la biblioteca ponemos lo sig:
 *     "scripts": {
      "test": "jest"
    }
 * Para correr la prueba pones en bash $ npm run test
 */

function sum(a, b) {
    return a + b;
  }
  module.exports = sum;
  
