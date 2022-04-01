const { areaRectangulo, areaCuadrado } = require("./areas");

test ("Debería sacar area del cuadrado en  números positivos", ()=>{
    const operacion = areaCuadrado.multiplica (2 , 2); //Paso parámetros a la función suma
    expect(operacion).toBe(4);
} );

test ("Debería sacar area del rectangulo en  números positivos", ()=>{
    const operacion = areaRectangulo.multiplica (6 , 2); //Paso parámetros a la función suma
    expect(operacion).toBe(12);
} );
