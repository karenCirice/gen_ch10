let estudiante1Cursos = ["Matematicas", "Ingles", "Programacion"];
let estudiante2Cursos = ["Geografia", "Español", "Programacion"];

function comparcion(array1, array2) {
    for (let i=0; i<=array1.length; i++){
           for (let x=0; x<=array1.length; x++) {
               if (array1[i] == array2[x]){
                   console.log("el curso que se repite es:",  array2[x]);
                }
           }   
    }
}

comparcion(estudiante1Cursos, estudiante2Cursos);