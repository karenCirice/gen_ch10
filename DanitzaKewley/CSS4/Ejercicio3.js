const nombreArreglo = [1, 2, 3, 4];
    let suma = 0
    let multiplicacion = 1
for (let i=0; i<nombreArreglo.length; i++){  
    suma += nombreArreglo[i];
    multiplicacion *= nombreArreglo[i];
}

 console.log("Suma total = " + suma + "  Multiplicación total = " + multiplicacion);
