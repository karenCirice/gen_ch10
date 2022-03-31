const sum = require('./sum');

test('adds 1 + 2 to equal 3', () => {
   
    // de la funcion sum, estableces a,b y el resultado esperado (toBe)
    expect(sum(1,2)).toBe(4);
});