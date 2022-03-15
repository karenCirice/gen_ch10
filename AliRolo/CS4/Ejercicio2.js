const nameArray2 = [5,6,7,8,9];
const answerArray = [];
function multiplicar(num) {
answerArray.push(num * 2);
}

nameArray2.forEach(multiplicar);

console.log(answerArray);