


document.getElementById('result').innerHTML = "Resultado";
function suma(){
    let numero1 = parseFloat(document.getElementById('num1').value);
    let numero2 = parseFloat(document.getElementById('num2').value);

    let res = numero1+numero2;
    document.getElementById('result').textContent = res; 
}
function resta(){
    let numero1 = parseFloat(document.getElementById('num1').value);
    let numero2 = parseFloat(document.getElementById('num2').value);

    let res = numero1-numero2;
    document.getElementById('result').textContent = res; 
}
function multiplica(){
    let numero1 = parseFloat(document.getElementById('num1').value);
    let numero2 = parseFloat(document.getElementById('num2').value);

    let res = numero1*numero2;
    document.getElementById('result').textContent = res; 
}
let divide = () => {
     numero1 = parseFloat(document.getElementById('num1').value);
     numero2 = parseFloat(document.getElementById('num2').value);

    let res = numero1/numero2;
    document.getElementById('result').textContent = res; 
}