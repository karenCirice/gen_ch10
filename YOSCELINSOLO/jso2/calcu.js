// Una función por operación//
function Functionsumar(){
    let numA = parseInt(document.getElementById("numA").value);
    let numB = parseInt(document.getElementById("numB").value);
    let result= numA + numB;
    document.getElementById("resultado").value= result;
    document.getElementById("operando").innerHTML= "+";

}

function Functionrestar(){
    let numA = parseInt(document.getElementById("numA").value);
    let numB = parseInt(document.getElementById("numB").value);
    let result= numA - numB;
    document.getElementById("resultado").value  = result;
    document.getElementById("operando").innerHTML= "-";
    
}

function Functionmult(){
    let numA =  parseInt(document.getElementById("numA").value);
    let numB =  parseInt(document.getElementById("numB").value);
    let result= numA * numB;
    document.getElementById("resultado").value  = result;
    document.getElementById("operando").innerHTML= "x";
    
}

function Functiondiv(){
    let numA =  parseInt(document.getElementById("numA").value);
    let numB =  parseInt(document.getElementById("numB").value);
    let result= numA / numB;
    document.getElementById("resultado").value  = result;
    document.getElementById("operando").innerHTML= "/";
}
// Usando función flecha
let Functionclear = () => {
    document.getElementById("resultado").value  ="";
    document.getElementById("numA").value  = "";
    document.getElementById("numB").value  = "";

}
