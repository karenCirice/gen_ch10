let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

console.log(people);

people.splice(1, 1);

console.log(people);

people.splice(2, 1);

console.log(people);

people.unshift("Luis");

console.log(people);

people.push("Eddie")

console.log(people);

people.splice(2,1);

console.log(people);

for(i = 0; i <= people.length; i++){
    if(people[i] == "Maria"){
        console.log(people[i]);
        break;
    }
}