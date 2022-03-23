// Mis funciones

/* Suma dos números: a + b : a y b type numeric  */
const suma = () => {
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    document.getElementById("res").value = (a+b);  
}

// /* Resta dos números: a - b : a y b type numeric  */
const resta = () => {
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    document.getElementById("res").value = (a-b);
}

// /* Multiplica dos números: a * b : a y b type numeric  */
const producto = () => {
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    document.getElementById("res").value = (a*b);
}

// /* Divide dos números: a / b : a y b type numeric  */
const division = () => {
    let a = parseInt(document.getElementById("num1").value);
    let b = parseInt(document.getElementById("num2").value);
    document.getElementById("res").value = (a/b);
}

// /* Borrar Campos */
function borrar(){
    document.getElementById("num1").value="";
    document.getElementById("num2").value="";
    document.getElementById("res").value="";
}

/* llamar números */
// let a = parseInt(document.getElementById("num1").value);
// let b = parseInt(document.getElementById("num2").value);

// console.log(a);
// console.log(b);



// /* Suma dos números: a + b : a y b type numeric  */
// const suma = (a,b) => document.getElementById("res").value = (a+b);

// /* Resta dos números: a - b : a y b type numeric  */
// const resta = (a,b) => document.getElementById("res").value = (a-b);

// /* Multiplica dos números: a * b : a y b type numeric  */
// const producto = (a,b) => document.getElementById("res").value = (a*b);

// /* Divide dos números: a / b : a y b type numeric  */
// const division = (a,b) => document.getElementById("res").value = (a/b);

// /* Borrar Campos */
// const borrar = () => {
//     document.getElementById("num1").value = "";
//     document.getElementById("num2").value = "";
//     document.getElementById("res").value = "";
// }

// let a = parseInt(document.getElementById("num1").value);
// let b = parseInt(document.getElementById("num2").value);

// console.log(a,b);