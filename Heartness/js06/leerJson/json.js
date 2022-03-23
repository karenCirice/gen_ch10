console.log("JS Funcionando.")

fetch("colors.json")
.then ((response) => response.json())
.then ((data) => {console.log(data);})