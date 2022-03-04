let student1Courses = ['Math', 'English', 'Programming'];
let student2Courses = ['Geography', 'Spanish', 'Programming'];

for(let i = 0; i < student1Courses.length; i++){
for(let j = 0; j < student2Courses.length; j++){
    if(student1Courses[i].toLowerCase() == student2Courses[j].toLowerCase()){
            console.log(student1Courses[i]);
    }
  
  }
}