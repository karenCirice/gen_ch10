function sumar(){
    let numberA = parseInt (document. getElementById ("numberA").value) ;
    let numberB = parseInt (document.getElementById ("numberB").value) ;
    document.getElementById ("result").value = (numberA+numberB);
}

function restar(){
    let numberA = parseInt (document.getElementById ("numberA" ).value);
    let numberB = parseInt (document.getElementById ("numberB" ).value);
    document.getElementById("result").value = (numberA-numberB);
}
function multiplicar(){
    let numberA = parseInt (document.getElementById("numberA").value);
    let numberB = parseInt (document.getElementById ("numberB" ).value);
    document.getElementById ("result").value = (numberA*numberB);
}
 function dividir(){
    let numberA = parseInt (document.getElementById ("numberA" ) .value) ;
    let numberB = parseInt (document.getElementById ("numberB" ).value) ;
    console. log (typeof (numberA) ) ;
    console. log (typeof (numberB) ) ;
    document.getElementById ("result") .value = (numberA/numberB);
}
function limpiar(){
        document.getElementById("result").value ="";
        document.getElementById ("numberA") .value ="";
        document.getElementById ("numberB") .value ="";
}


 