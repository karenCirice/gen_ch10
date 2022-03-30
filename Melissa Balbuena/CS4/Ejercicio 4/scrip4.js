let Courses1 = ['Matematicas', 'Ingles', 'PProgramacion'];
let Courses2 = ['Geografia', 'Espanol', 'Programacion'];

for(i = 0; i < Courses1.length; i++)
{
    for(j = 0; j < Courses2.length; j++)
    {
        if (Courses1[i] == Courses2[j])
        {
            console.log("Comparten materia:", Courses1[i])
        }
    }
}