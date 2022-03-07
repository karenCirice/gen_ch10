//función que suma cada uno y todos los elementos numéricos de un arreglo 

function suma() {
    const array = [1, 2, 3, 4];
    let sum = 0;
    

    for (let i = 0; i < array.length; i++) {
        
        sum += array[i];
    }

    
    console.log("Los datos del array son: ", array);
    console.log("La suma del arreglo es: ", sum);
}
    
suma();

//función que multiplica cada uno y todos los elementos numéricos de un arreglo 

function multiplication() {
    const arr=[5,7,2];
    let total = 1;
    
    for (let i = 0; i < arr.length; i++) {
        if(arr[i]!=0){
            total=(arr[i]*total);
        }
        
    }
    console.log("Los datos de la lista son: ", arr);
    console.log("La multiplicación de todos los datos son : ", total);

}
multiplication();

