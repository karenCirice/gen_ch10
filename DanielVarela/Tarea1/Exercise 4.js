let student1Courses = ['Math', 'English', 'Programming'];
let student2Courses = ['Geography', 'Spanish', 'Programming'];

for(i = 0; i < student1Courses.length; i++)
{
    for(j = 0; j < student2Courses.length; j++)
    {
        if (student1Courses[i] == student2Courses[j])
        {
            console.log("Comparten la materia de:", student1Courses[i])
        }
    }
}
