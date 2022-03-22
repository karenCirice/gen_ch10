let total = 0;

function suma(){ /* Creamos la función suma que hará la suma al hacer click sobre su botón */
    let a = parseInt(document.getElementById("a").value); /* Creamos una varable "a" que guardará el del Input con el Id "a" */
    let b = parseInt(document.getElementById("b").value); /* Creamos una varable "b" que guardará el del Input con el Id "b" */
    total = a + b; /* Creamos una varable "total" que guardará la suma de la varable "a" con la variable "b" */
    console.log(total);
    document.getElementById("c").innerHTML = total; /* Damos salida al total de la suma en un párrafo del documento HTML */
    return total;
}

function resta(){
    let a = document.getElementById("a").value; /* Creamos una varable "a" que guardará el del Input con el Id "a" */
    let b = document.getElementById("b").value; /* Creamos una varable "b" que guardará el del Input con el Id "b" */
    total = a - b; /* Creamos una varable "total" que guardará la resta de la varable "a" con la variable "b" */
    console.log(total);
    document.getElementById("c").innerHTML = total; /* Damos salida al total de la resta en un párrafo del documento HTML */
    return total;
}

function multi (){
    let a = document.getElementById("a").value; /* Creamos una varable "a" que guardará el del Input con el Id "a" */
    let b = document.getElementById("b").value; /* Creamos una varable "b" que guardará el del Input con el Id "b" */
    total = a * b; /* Creamos una varable "total" que guardará la multiplicación de la varable "a" con la variable "b" */
    console.log(total);
    document.getElementById("c").innerHTML = total; /* Damos salida al total de la multiplicación en un párrafo del documento HTML */
    return total;
}

function divi (){
    let a = document.getElementById("a").value; /* Creamos una varable "a" que guardará el del Input con el Id "a" */
    let b = document.getElementById("b").value; /* Creamos una varable "b" que guardará el del Input con el Id "b" */
    total = a / b; /* Creamos una varable "total" que guardará la división de la varable "a" con la variable "b" */
    console.log(total);
    document.getElementById("c").innerHTML = total; /* Damos salida al total de la división en un párrafo del documento HTML */
    return total;
}