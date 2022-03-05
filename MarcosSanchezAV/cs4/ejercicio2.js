function Doublearray(array) {
    let array2 = [];
    for (let i = 0; i < array.length; i++) {
        array2.push(array[i]*2);
    }
    return array2;
}