let arr = ["This", "is", "a", "sentence"];
function printOutString(array) {
    let sentence;
    for (let i = 0; i < array.length ;i++) {
        if (i == 0) {
            sentence = array[i];
        } else {
        sentence = sentence + " " + array[i];
    }}
    return sentence;
}

console.log(printOutString(arr));