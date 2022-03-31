const num = [1,5,8,9,6,45];
let sum = num[0];
let product = num[0];

for (i = 1; i < num.length; i++)
{
    sum += num[i];
    product *= num[i];
}

console.log("Suma:" , sum);
console.log("Multiplicacion:" , product);