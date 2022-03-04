let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
people.splice(1,1);
people.splice(2,1);
people.unshift("Luis");
people.push("Marcos");
for (let i=0; i<people.length; i++) {
    console.log(people[i]);
    if (people[i] == "Maria") {
        break;
    }
}
people.indexOf("María");