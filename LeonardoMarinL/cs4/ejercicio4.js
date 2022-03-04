//Ejercicio 4: Crear un programa con loop en 2 arreglos y que imprima los valores que se repiten
console.log("Ejercicio ",4);

let curso1 = ["Math","English","Programming"];
let curso2 = ["Geography","Spanish", "Programming"];

function comparación(){
   for (let i=0; i<curso1.length; i++){
    let c1 = curso1[i];
    for (let j=0; j<curso2.length; j++){
      let c2 = curso2[j];
      if (c1==c2){
        console.log(c1||c2);
      }
    }
  }
}
comparación();