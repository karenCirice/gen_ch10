function calcular() {
    let dia = document.getElementById("dia").value;
    let mes = document.getElementById("mes").value;
    let anio = document.getElementById("anio").value;

    const d = new Date(mes+" "+dia+", "+anio);
    let numeroDia = d.getDay();

    console.log(typeof(numeroDia));

    switch(numeroDia) {
        case 0: 
            document.getElementById("resultado").value = "Domingo, no es laborable";
            break; 
        case 1: document.getElementById("resultado").value = "Lunes, es laborable";
            break;
        case 2: document.getElementById("resultado").value = "Martes, es laborable";
            break; 
        case 3: document.getElementById("resultado").value = "Miercoles, es laborable";
            break; 
        case 4: document.getElementById("resultado").value = "Jueves, es laborable";
            break; 
        case 5: document.getElementById("resultado").value = "Viernes, es laborable";
            break; 
        case 6: document.getElementById("resultado").value = "Sabado, no es laborable";
            break; 
    }
 
}