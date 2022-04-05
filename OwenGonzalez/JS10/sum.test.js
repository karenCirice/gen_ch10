/**
 * Este es el formato del .test.js
 * Aquí se pone lo que deberia de salir como resultado 
 * del sum.js
 */
 const sum = require ("./sum") ;

 test ("Sumamos 1 + 2 y esperamos 3" , ()=>{
     expect( sum( 1 , 2 )).toBe(3);
 });
 

