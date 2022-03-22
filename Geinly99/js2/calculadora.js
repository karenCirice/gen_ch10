function sumar(){
<<<<<<< HEAD
    let numberA = parseInt (document. getElementById ("numberA") .value) ;
    let numberB = parseInt (document.getElementById ("numberB").value) ;
    console. log (typeof (numberA) ) ;
    console. log (typeof (numberB));
    document.getElementById ("result"). value = (numberA+numberB);
=======
    let numberA = parseInt (document. getElementById ("numberA").value) ;
    let numberB = parseInt (document.getElementById ("numberB").value) ;
    console. log (typeof (numberA) ) ;
    console. log (typeof (numberB));
    document.getElementById ("result").value = (numberA+numberB);
>>>>>>> 27c570dba6e7cb488f6c21813cccc0a92fb98942
}

    function restar(){
    let numberA = parseInt (document.getElementById ("numberA" ).value) ;
    let numberB = parseInt (document.getElementById ("numberB" ).value);
    console. log (typeof (numberA) ) ;
    console. log (typeof (numberB));
    document.getElementById("result").value = (numberA-numberB);

}
function multiplicar(){
<<<<<<< HEAD
    let numberA = parseInt (document.getElementById("numberA").value);
    let numberB = parseInt (document.getElementById ("numberB" ).value) ;
    console. log (typeof (numberA));
    console. Log(typeof (numberB));
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
    let limpiar = document.getElementById('limpiar');
    result.textContent = "";
    numberA = 0;
    numberB = 0;
    result = "";
=======
    let numberA = parseInt (document. getElementById ("numberA") .value) ;
    let numberB = parseInt (document.getElementById ("numberB").value) ;
    console. log (typeof (numberA) ) ;
    console. log (typeof (numberB));
    document.getElementById ("result").value = (numberA*numberB);
    /* let numberA = parseInt (document.getElementById("numberA").value);
    let numberB = parseInt (document.getElementById ("numberB" ).value);
    document.getElementById ("result").value = (numberA*numberB); */
}
    function dividir(){
    let numberA = parseInt (document.getElementById("numberA" ).value) ;
    let numberB = parseInt (document.getElementById("numberB" ).value) ;
    console. log (typeof (numberA) ) ;
    console. log (typeof (numberB) ) ;
    document.getElementById("result").value = (numberA/numberB);
}
function limpiar(){
    document.getElementById("result").value ="";
    document.getElementById ("numberA") .value ="";
    document.getElementById ("numberB") .value ="";
>>>>>>> 27c570dba6e7cb488f6c21813cccc0a92fb98942
}


 