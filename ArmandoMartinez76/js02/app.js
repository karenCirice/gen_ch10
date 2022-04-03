//Calculadora

function limpiar() {
    document.getElementById('miCalculadora').reset();
}

function suma() {
    //let x = parseInt(document.getElementById('cifra1').value);
    //let y = parseInt(document.getElementById('cifra2').value);
    //document.getElementById('salida').innerHTML = x + y;
    let x = (x, y) => x + y;
    document.getElementById("salida").innerHTML = x(parseInt(document.getElementById('cifra1').value), parseInt(document.getElementById('cifra2').value));
}

function resta() {
    //let x = parseInt(document.getElementById('cifra1').value);
    //let y = parseInt(document.getElementById('cifra2').value);
    //document.getElementById('salida').innerHTML = x - y;
    let x = (x, y) => x - y;
    document.getElementById("salida").innerHTML = x(parseInt(document.getElementById('cifra1').value), parseInt(document.getElementById('cifra2').value));
}


function multiplicacion() {
    //let x = parseInt(document.getElementById('cifra1').value);
    //let y = parseInt(document.getElementById('cifra2').value);
    //document.getElementById('salida').innerHTML = x * y;
    let x = (x, y) => x * y;
    document.getElementById("salida").innerHTML = x(parseInt(document.getElementById('cifra1').value), parseInt(document.getElementById('cifra2').value));
}


function division() {
    //let x = parseInt(document.getElementById('cifra1').value);
    //let y = parseInt(document.getElementById('cifra2').value);
    //document.getElementById('salida').innerHTML = x / y;
    let x = (x, y) => x / y;
    document.getElementById("salida").innerHTML = x(parseInt(document.getElementById('cifra1').value), parseInt(document.getElementById('cifra2').value));
}
function residuo() {
    //let x = parseInt(document.getElementById('cifra1').value);
    //let y = parseInt(document.getElementById('cifra2').value);
    //document.getElementById('salida').innerHTML = x % y;
    let x = (x, y) => x % y;
    document.getElementById("salida").innerHTML = x(parseInt(document.getElementById('cifra1').value), parseInt(document.getElementById('cifra2').value));
}

(function habla(){
    let msg = new SpeechSynthesisUtterance();
    msg.text = "Gracias por usar la calculadora, no es de lo mas bonita pero es funcional";
    msg.lang = "es-ES";
    window.speechSynthesis.speak(msg);
})();





