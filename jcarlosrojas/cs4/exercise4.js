/*
Exercise #4

let student1Courses = ["Math", "English", "Programming"];
let student2Courses = ["Geography", "Spanish", "Programming"];
Create a program that loops over the 2 arrays; if there are any common courses
print them out to the console.
*/

let student1Courses = ["Math", "English", "Programming"];
let student2Courses = ["Geography", "Spanish", "Programming"];
let sameCourses = [];

function compareCourses (arr1,arr2) {
    let k=0;
    for (let i=0; i<student1Courses.length; i++) {
       for (let j=0; j<student1Courses.length; j++) {
           if (student1Courses[i] == student2Courses[j]) {
               sameCourses[k] = student2Courses[j];
               k++;
           }
       }
    }
    
    if (sameCourses.length != 0) {
        console.log(sameCourses);
    } else {
        console.log("They are not same courses");
    }
    
}

compareCourses(student1Courses,student2Courses);

