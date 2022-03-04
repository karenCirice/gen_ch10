let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

//1
for(let i = 0; i < people.length; i++){
    console.log(people[i]);
}

// 2
peopleNew = people.splice(1,1);{
console.log(people)}

//3
peopleNew2 = people.splice(2,1);{
console.log(people)}

//4
people.unshift("Luis");{
    peopleNew3 = people.splice(2,1);{
console.log(people)}
}

//5
people.push("Danitza");{
console.log(people)}

//6
for(let i =0; i< people.length; i++){
    if(i > 1){
        break;
    }
    console.log(people[i]);
}

//7
people.indexOf("Maria");
