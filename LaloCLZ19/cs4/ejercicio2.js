//Ejercicio 2
const array = [1, 2, 4, 5]

function dobleValue(arr) {
    for (let i = 0; i < arr.length; i++) {
        arr[i] = arr[i]*2;
    }
    console.log(arr);
}

dobleValue(array);