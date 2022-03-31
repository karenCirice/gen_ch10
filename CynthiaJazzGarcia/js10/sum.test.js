const sum = require ("./sum") ;

test ("Sumamos 1 + 2 y esperamos 3", ()=>{
    expect(sum(1,2)).toBe(3);
});
 //la coma va despues del comentario y detro de parentis
 /*despues se abre una funcion llave para saber que esperamos (expect) y
  se pasan parametros a sum*/
