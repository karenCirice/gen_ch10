
// Exercise #4
let student1Courses = ['Math', 'English', 'Programming'];
let student2Courses = ['Geography', 'Spanish', 'Programming'];
// // Create a program that loops over the 2 arrays; if there are any common courses print them out to the console.
// //  
let commonCourses = "";

function printCommonCourses(courses1,courses2){
    courses1.forEach(component =>{
        for(let i=0; i<courses2.length; i++){
            if (component == courses2[i]) commonCourses += component + " ";
        }
    });
    console.log(commonCourses);
}
printCommonCourses(student1Courses,student2Courses);
