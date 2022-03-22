//hoy.toDateString(aaaa/mm/dd); // "Sun Jun 14 2020"
//formato.replace('mm', fecha.getMonth() + 1);

// Mis funciones

/* Suma dos números: a + b : a y b type numeric  */
const calcular = () => {
    let d = parseInt(document.getElementById("day").value);
    let m = parseInt(document.getElementById("month").value);
    let a = parseInt(document.getElementById("year").value);
    //console.log(d,m,a);
    
    
    //---llamada al método calcular  
    //dimeDia(d,m,a);

    const dias = ["Lunes","Martes","Miercoles","Jueves","Viernes"];
    const fecha = new Date(a,m-1,d);
    // console.log(fecha);
    // console.log(String(fecha));
    let mystring = String(fecha);
    let otro = mystring.substring(0,3);
    //console.log(otro);

    switch (otro){
        case "Sun": 
            //console.log("Es Domingo, día no laborable");
            document.getElementById("res").value = "Es Domingo, día no laborable";
        break;
        case "Sat":
            //console.log("Es Sábado, día no laborable");
            document.getElementById("res").value = "Es Sábado, día no laborable";
        break;
        default: 
            let dia = dias[fecha.getDay()-1];
            //console.log(dia+", es día laborable...:O");
            document.getElementById("res").value = dia+", es día laborable... :O";
    }
}



// /* Borrar Campos */
function borrar(){
    document.getElementById("day").value="";
    document.getElementById("month").value="";
    document.getElementById("year").value="";
    document.getElementById("res").value="";
}

