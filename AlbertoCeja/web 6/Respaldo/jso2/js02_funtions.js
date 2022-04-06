function suma(){
    let numero1 = parseInt(document.getElementById('number1').value);
    let numero2 = parseInt(document.getElementById('number2').value);
    let sumatoria = numero1 + numero2;
    document.getElementById('resultado').value = sumatoria;
}
function resta(){
    let numero1 = parseInt(document.getElementById('number1').value);
    let numero2 = parseInt(document.getElementById('number2').value);
    let resta = numero1 - numero2;
    document.getElementById('resultado').value = resta;
}
function multiplicacion(){
    let numero1 = parseInt(document.getElementById('number1').value);
    let numero2 = parseInt(document.getElementById('number2').value);
    let mult = numero1 * numero2;
    document.getElementById('resultado').value = mult;
}
function division(){
    let numero1 = parseInt(document.getElementById('number1').value);
    let numero2 = parseInt(document.getElementById('number2').value);
    let div = numero1 / numero2;
    document.getElementById('resultado').value = div;
}
function limpiar(){
    document.getElementById('number1').value = '';
    document.getElementById('number2').value = '';
    document.getElementById('resultado').value = '';
}