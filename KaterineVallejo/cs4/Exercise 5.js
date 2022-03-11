let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

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
// 1
print();
// 2
remove(people,"Dani");
//3
remove(people,"Juan");
//4
//En caso de que se quiera eliminar el nombre duplicado se utiliza la siguiente linea en caso contrario no
//remove(people,"Luis");
people.unshift("Luis");
//5
people.push("Aaron")
//6
console.log("\n");
print("Maria");
//7
console.log("\n");
console.log(people.indexOf("Maria"));

//Impresion Final
console.log("\n");
print();