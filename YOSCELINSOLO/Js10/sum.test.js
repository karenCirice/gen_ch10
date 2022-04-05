//Estoy probando una sumatoria de 2 números 

const sum =require ("./sum");

test ("Sumamos 1 + 2 y esperamos 3", () => {
    expect ( sum (1 , 2 )).toBe(3);
});