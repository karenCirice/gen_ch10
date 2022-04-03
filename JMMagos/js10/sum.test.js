/**Constante que será la función creada */
const sum=require("c:/generation/Sergio/gen_ch10/JMMagos/js10/sum");

/**se pueba el resultado de la suma contenida en
 * el archivo .js, expect es la parte con la salida expectada 
 * y lo esperable es lo que se encuentra en .tobe
 */
test ("Suma de a + b y regresa 3", ()=>{
    expect(sum(1, 2)).toBe(3);
});