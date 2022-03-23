const student1Courses = ['Math', 'Programming', 'English'];
const student2Courses = ['Geography', 'Spanish', 'Programming'];

function school(arr1, arr2) {
    for (let i = 0; i < arr1.length; i++) {
        for (let j = 0; j < arr2.length; j++) {
            if(arr1[i] == arr2[j])
            {
                console.log("El curso que es igual es: "+arr1[i]+" y "+arr2[j]);
            }
        }
    }
}

school(student1Courses, student2Courses);