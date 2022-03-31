const sum = require('./sum');

test('La suma de 1 + 2 tiene que resultar 3', () => {
    expect(sum(1, 2)).toBe(3);
});