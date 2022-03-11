let array = [5, 6, 7, 8];
let newArray = array.Slice();
function doublesNumbers(arr){
    arr.forEach(function(element) {
        console.log(element *= 2);
    });
    array.forEach(function(element) {
         console.log(element);
    });
}
doublesNumbers(newArray);
