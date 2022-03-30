const sum = require ("./sum"); /* Aquí se está llamando al archivo sum.js que se encuentra en la misma carpeta */
/* Test en una palabra establecida para hacer chequeo, entre paréntesis abrimos los que se espera, se agrega una function anónima con función flecha, la cual nos dice que se espera que la suma de 1 y 2 sea 3, estos digitos nosotros debemos de conocer el resultado correcto */
test ("Sumamos 1 + 2 y esperamos 3" , () => {
    expect (sum ( 1 , 2 )).toBe( 3 );
});
