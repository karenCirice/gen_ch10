const sum = require('./sum');

test("Suma de 1 mas 2 y esperamos 3", () =>{
    expect(sum(1, 2)).toBe(3);
});