let student1Courses = ['Programming','Math', 'English','french', "Italian" ];
let student2Courses = ['french','Geography', 'Spanish', 'Programming', "Italian"];

for ( i=0; i<student1Courses.length; i++){

    for(j=0; j< student2Courses.length; j++){

        if(student1Courses[i] === student2Courses[j]){
            console.log("The same courses are " + student1Courses[i] +" & "+ student2Courses[j])
        }
    }
}