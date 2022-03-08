let people = ["María", "Dani", "Luis", "Juan", "Camila"];
//1. Escriba un comando que imprima a todas las personas de la lista.
console.log(people.join(' '));
//2. Escriba el comando para eliminar "Dani" de la matriz.
people.splice(1, 1);
console.log(people.join(' '));
//3. Escriba el comando para eliminar "Juan" de la matriz.
people.splice(2, 1);
console.log(people.join(' '));
//Escriba el comando para agregar "Luis" al frente de la matriz.
people.splice(0, 0, "Luis");
//console.log(people.join(' '));
/*
console.log(people.unshift(people[2]));
console.log(people.join(' '));
*/
people.splice(2, 1);
console.log(people.join(' '));
//5. Escriba el comando para agregar su nombre al final de la matriz.
people.push('Francisco');
console.log(people.join(' '));
//6. Usando un ciclo, itere a través de esta matriz y después de console.log "Maria", salga del ciclo.

for(const peoples of people ){
    if(peoples ==='Maria')
    {
        break;
    }
    console.log (peoples);
}
//7. Escriba el comando que da el índice de donde se encuentra "María".
people.forEach(function (element,index,arreglo)
{
    
    console.log(element);
    console.log(index);
    console.log(arreglo); 
    
});

//Al final del ejercicio, debe haber 4 personas en la matriz.
console.log(people.join(' '));

