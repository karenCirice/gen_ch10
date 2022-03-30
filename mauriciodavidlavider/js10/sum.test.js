//const { exportAllDeclaration } = require("@babel/types");

const sum = required("./sum");

test ("Sumamos 1+2 y esperamos 3", () => {
    expect( sum(1, 2) ).toBe(3);
});