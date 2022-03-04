const genericArray = [1, 2, 3, 4 , 5, 6, 7, 8, 9, 10];

function DoubleNumbers(value) {
    let array = new Array ();
    for(let i = 0; i < value.length; i++){
        array.push(value[i]*2)
    }
    console.log(array);
}

DoubleNumbers(genericArray);