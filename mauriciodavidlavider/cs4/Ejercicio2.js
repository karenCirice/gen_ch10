
let arr = [1, 2, 3, 4];

function duplicador(entrada) {
    let salida = [];
    for(let i=0; i<entrada.length; i++){
        salida.push(arr[i]*2);
    }
    return salida
}

console.log(duplicador(arr));
