let m1 = [10, 2, 5, 2];
let s= 0;
let p= 1; 
let d= 2;
function mult(m1) {
    for (let i=0; i < m1.length; i++){
        s+= m1[i];
        p*= m1[i];
        d/= m1[i];
        
      
    }
     console.log(`Resultado de la suma: ${s}`);
    console.log(`Resultado de la multiplicación: ${p}`);
    console.log(`Resultado de la división: ${d}`);
    
}
mult(m1);