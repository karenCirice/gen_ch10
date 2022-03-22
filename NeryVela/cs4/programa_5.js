let people = ["Maria", "Dani", "Luis", "Juan", "Camila"];
for(let i=0; i<people.length; i++){
    console.log(people[i]);
    
}
console.log("\n");

people.splice(1,1);

for(let i=0; i<people.length; i++){
    console.log(people[i]);
    }
    console.log("\n");
    
    people.splice(2,1);

for(let i=0; i<people.length; i++){
    console.log(people[i]);
    }
    
      console.log("\n");
     
    
    people.splice(1,1);

for(let i=0; i<people.length; i++){
    console.log(people[i]);
    }
    
   console.log("\n"); 

    people.unshift("Luis");
    for(let i=0; i<people.length; i++){
    console.log(people[i]);
    }
    
     console.log("\n"); 

    people.push("Nery");
    for(let i=0; i<people.length; i++){
    console.log(people[i]);
    }
    
    console.log("\n");
    
    for(let i=0; i<2; i++){
    console.log(people[i]);
    }
    
    console.log("\n");
    let a=people.indexOf("Maria");
    console.log(a);