function changeName(){
    let nameC = prompt("Please enter your name", "Spidey Gónzalez")
    //prompt, función para que te pregunté en pantalla, arroja el valor a nameC
        document.getElementById("demo").innerHTML = "Hola " +nameC;
    //El document cambia la info de demo en el html a lo que se le arroja después del igual
    //En este caso solo queremos cambiar el nombre del archivo
}
