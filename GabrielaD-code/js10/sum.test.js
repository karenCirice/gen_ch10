// const { TestWatcher } = require("jest");
const sum = require("./sum");

// Prueba unitaria 1 de mi suma
/**
 * Función de prueba al que le pasamos dos parámetros para sumar
 * @param {Numeric} a =1
 * @param {Numeric} b =2 
 * debe retornar 3
 */
test("Suma 1 + 2 y esperamos 3", ()=>{
    expect(sum(1,2)).toBe(3);
});