console.log("Iniciando script");


let sum = () => {
    let numA = document.getElementById("numA").value;
    let numB = document.getElementById("numB").value;

    let result = parseInt(numA) + parseInt(numB);
    document.getElementById("result").innerHTML= result.toString();
    console.log(result);
}


let subst = () => {
    let numA = document.getElementById("numA").value;
    let numB = document.getElementById("numB").value;

    let result = parseInt(numA) - parseInt(numB);
    document.getElementById("result").innerHTML= result.toString();
    console.log(result);
}


let prod = () => {
    let numA = document.getElementById("numA").value;
    let numB = document.getElementById("numB").value;

    let result = parseInt(numA) * parseInt(numB);
    document.getElementById("result").innerHTML= result.toString();
    console.log(result);
}


let divi = () => {
    let numA = document.getElementById("numA").value;
    let numB = document.getElementById("numB").value;

    let result = parseInt(numA) / parseInt(numB);
    document.getElementById("result").innerHTML= result.toString();
    console.log(result);
}


let clearFields = () => {
    document.getElementById("numA").value= "";
    document.getElementById("numB").value= "";
    document.getElementById("result").innerHTML= "Resultado";
}
