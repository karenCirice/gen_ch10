const people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

people.forEach(element => console.log(element));

function remove(array, data) {
    let index=array.indexOf(data);
    array.splice(index, 1);
    console.log(array);
}
remove(people, "Dani");
remove(people, "Juan");
remove(people, "Luis");
people.unshift("Luis");
console.log(people);

people.push("Eli");
console.log(people);
for (let i = 0; i < people.length; i ++){
    console.log(people[i]);
    if(people[i]== "Maria"){
        break;
        
    }
}
console.log("Maria se encuentra en el lugar: ", people.indexOf("Maria"));
