let number = [1, 2, 4, 5];
function doubles (num) {
    let array = new Array();
    for (let x = 0; x < num.length; x++){
        array.push(num[x]*2)
    }
    console.log (array)
}
doubles(number)
