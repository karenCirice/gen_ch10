// programa qeu compara cadenas e imprime las iguales 

let student1C = ['ALEJANDRA' , 'Math', 'English', 'Programming' ];
let student2C= ['Geography', 'Spanish', 'Programming' , 'ALEJANDRA'];



function compare() {
    
    for (let i = 0; i < student1C.length; i++) {
        for (let j = 0; j < student2C.length; j++) {
            
            if(student1C[i]===student2C[j]){
                console.log(student1C[i]); 
            }
        }
    }
    
}
compare();
