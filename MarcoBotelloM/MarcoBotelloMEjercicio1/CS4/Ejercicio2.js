const array= [1,4,5,6,8,3]
 
function mul(arrays) {
   console.log(arrays*2);
}
 
const copyArray = array.slice();
mul(copyArray);
array.forEach(mul);
console.log=(copyArray);
 
