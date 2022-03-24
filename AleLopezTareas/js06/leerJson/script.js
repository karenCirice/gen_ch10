console.log("Si funciona leer Json ");

fetch("colors.json")
//.then((response) => {console.log(response);}) other option 
.then((response) => response.json())
.then ((data => {
    console.log(data);
}))