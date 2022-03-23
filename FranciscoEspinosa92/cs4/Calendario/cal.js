//primero una funcion que concatene los valores recibidos 
//para pasarla a la api new Date.getDay()
//preciso saber que la semana empieza en domingo
//el mes empieza con 0=enero
//tambien construir un swich 

let cal =()=>{
    //obtener los valores capturados en año,mes,dia, ponemos entre comillas vacias, datos como hora y segundo y demas... auqnue podria no declararlos. (hay un -1 en el mes, es por que la new date inicializa enero en 0)
    let fechaDesor = new Date(parseInt(document.getElementById("año").value),(parseInt(document.getElementById("mes").value)-1),parseInt(document.getElementById("dia").value),"","","","");
    console.log(fechaDesor);//Poner console.log para mapear en donde se quedan los datos...
    let numDia = fechaDesor.getDay();//getDay necesita forzosamente una variable que guarde y ser parte de un metodo para arrojar solo el día. 
    console.log(numDia);
    //new Date inicializa domingo con 0, entonces el primer y ultimo caso seran no laborables.Sí, claro idealmente solo laboran lunes a viernes...
    switch(numDia){
            case 0 :
            document.getElementById("1").value ="Dominguito,No laborable... ";
            console.log("domingo"); 
            break;
            
            
            case 1 :
            document.getElementById("1").value ="Lunes pa, Laborable... ";
            console.log("lunes");
            break;
            
            
            case 2 :
            document.getElementById("1").value ="Martes, laborable... ánimo";
            console.log("martes");
            break;
            
            case 3 :
            document.getElementById("1").value ="Miercoles, laborable... ya es ombligo de semana";
            console.log("miercoles");
            break;
            
            case 4 :
            document.getElementById("1").value ="Juebebes, laborable... ya huele a carnita asada";
            console.log("jueves");
            break;
            
            case 5 :
            document.getElementById("1").value ="Viernes de webeo, laborable... ";
            console.log("viernes");
            break;
            
            case 6 :
            document.getElementById("1").value ="Mequiero volver chango,No laborable... ";
            console.log("sabado");
            
    }
    let reset = ()=>{
        document.getElementById("1").value=""
        document.getElementById("año").value=""
        document.getElementById("dia").value=""
        document.getElementById("mes").value=""  
        };

}