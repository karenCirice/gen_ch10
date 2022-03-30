let people = ["Itzel", "Julia", "Oscar", "Meli", "Adrian"];

function print(obj)
{
    for (i = 0; i < people.length; i++)
    {
        console.log(people[i]);
        if(obj == people[i])
            break;
    }
}

function remove(arr,obj)
{
    let x = arr.indexOf(obj);
    arr.splice(x,1);
}

print();

remove(people,"Julia");

remove(people,"Meli");

people.unshift("Oscar");

people.push("Adrian")

console.log("\n");
print("Itzel");

console.log("\n");
console.log(people.indexOf("Itzel"));

console.log("\n");
print();