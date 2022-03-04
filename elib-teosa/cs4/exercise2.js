const numbersArray = [1, 2, 3, 4, 5];

function doubles(array) {
    for (let i = 0; i < array.length; i++) {
        array[i]=array[i]*2;
    }
    console.log(array);
}

doubles(numbersArray);