//Ejercicio 4: Crear un programa con loop en 2 arreglos y que imprima los valores que se repiten

console.log("Ejercicio 4");

let student1Courses = ['Math', 'Chemistry','English', 'Programming'];
let student2Courses = ['Chemistry','Geography', 'Programming'];

let tam1 = student1Courses.length;
let tam2 = student2Courses.length;

let commonCourses = [];

for (let i = 0; i < tam1; i++) {
    for (let j = 0; j < tam2; j++) {
        if(student1Courses[i] === student2Courses[j]){
            commonCourses.push(student1Courses[i]);
        }
    }
}

console.log(commonCourses);