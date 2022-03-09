let estudiante1Cursos = ['Matemáticas', 'Inglés', 'Programación'];
let estudiante2Cursos = ['Geografía', 'Español', 'Programación'];

for(i = 0; i<estudiante1Cursos.length; i++){
    for(j =0; j<estudiante2Cursos.length; j++){
        if(estudiante1Cursos[i]==estudiante2Cursos[j]){
            console.log(estudiante2Cursos[j]);
        }
    }
}
