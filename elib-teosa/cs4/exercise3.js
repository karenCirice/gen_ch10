const numberArray = [1, 2, 3, 4];

function sumAndProduct(array) {
    let sum=0, product=1;
    for (let i = 0; i < numberArray.length; i++) {
        sum+=array[i];
        product*=array[i];
    }
    console.log(`The sum is ${sum}. The product is ${product}`);
}

sumAndProduct(numberArray);