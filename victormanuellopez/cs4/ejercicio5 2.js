let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
console.log(people);
let datoeliminados = people.splice(1,1); 
console.log("el nombre eliminado es: "+ datoeliminados);
datoeliminados = people.splice(2,1)
console.log("el nombre eliminado es: "+ datoeliminados);
console.log(people);
people.splice(0, 1, 'Luis');
people.splice(1, 1, 'Maria');
people.push("Victor");
console.log(people);

for (let i = 0; i <= people.length; i++) {
    console.log(people[i]);
    if(people[i] == "Maria"){
        break;
    }
}

people.indexOf("Maria");
console.log(people);