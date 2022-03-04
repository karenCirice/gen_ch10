let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
function list(name) {
    console.log(name)
}
people.forEach(list);

let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
people.splice(1,1);
console.log(people);

let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
people.splice(2,1);
console.log(people);

people[0] = "Luis";
people[1] = "Maria";
console.log(people);

people[people.length] = "Alondra";
console.log(people);

for (let i = 0; i <people.length; i++){
    console.log(people[1] + " exit from the loop");
    }

console.log(people.indexOf("Maria"));

console.log(people);