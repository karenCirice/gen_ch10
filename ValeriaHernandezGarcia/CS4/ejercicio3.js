function operation(){
    const array = [1, 2, 3, 4];
    let sum = 0, mul=0; total = 1;

    for (let i = 0; i < array.length; i++){
    sum += array [i]!=0;
        if(array[i]!=0){
            total=(array[i]*total);
        }
    }
    console.log("Datos del array: ", array);
    console.log("La suma es: ", sum);
    console.log("La umtiplicación es: ", total);
    
}
operation();
