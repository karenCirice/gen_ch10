//Funcion para modificar los valores ingresados en los input
function modificarValor(resultado){
    document.getElementById("resultadoFinal").value = resultado;
}

//Funcion para sumar los valores ingresados en los input
let sumar = ()=>{
    modificarValor((parseInt(document.getElementById("numeroA").value))+(parseInt(document.getElementById("numeroB").value)));
}
//Funcion para restar los valores ingresados en los input
let restar = ()=>{
    modificarValor((parseInt(document.getElementById("numeroA").value))-(parseInt(document.getElementById("numeroB").value)));
}

//Funcion para multiplicar los valores ingresados en los input
let multiplicar = ()=>{
    modificarValor((parseInt(document.getElementById("numeroA").value))*(parseInt(document.getElementById("numeroB").value)));
}

//Funcion para dividir los valores ingresados en los input
let dividir = ()=>{
    modificarValor((parseInt(document.getElementById("numeroA").value))/(parseInt(document.getElementById("numeroB").value)));
}

//Funcion para borrar los valores ingresados en los input
let borrar = ()=>{
    document.getElementById("numeroA").value = "";
    document.getElementById("numeroB").value = "";
    document.getElementById("resultadoFinal").value = "";
}
