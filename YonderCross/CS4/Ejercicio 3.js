function SumaProduct(){

    let numer = [];
    
        numer[0] = prompt("Ingresa valor 1",0);
        numer[1] = prompt("Ingresa valor 2",0);
        numer[2] = prompt("Ingresa valor 3",0);
        numer[3] = prompt("Ingresa valor 4",0);
    
       console.log(numer); 
    
    let sum = 0; 
    for( i=0; i<=numer.length-1; i++){
    
       sum = parseInt(numer[i]) + sum;
                }
        
       console.log("La suma es = " + sum); 
    
    let pro = 1; 
    for( i=0; i<=numer.length-1; i++){
    
       pro = parseInt(numer[i]) * pro;
                }   
       console.log("El producto es = " + pro); 
    }
    SumaProduct();
    