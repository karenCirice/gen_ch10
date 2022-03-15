function sumproduct(array) {
    let sum = 0; product = 1;
    for (let i = 0; i < array.length; i++) {
        sum = sum + array[i];
        product = product*array[i];
    }
    return "The sum is " + sum + ". The product is " + product + ".";
}