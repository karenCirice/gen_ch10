function Suma() {
    document.getElementById("res").value = parseInt(document.getElementById("v1").value) + parseInt(document.getElementById("v2").value);
}
function Resta() {
    document.getElementById("res").value = parseInt(document.getElementById("v1").value) - parseInt(document.getElementById("v2").value);
}
function Multiplicacion() {
    document.getElementById("res").value = parseInt(document.getElementById("v1").value) * parseInt(document.getElementById("v2").value);
}
function Division() {
    const z = (x, y) => x / y;
    document.getElementById("res").value = z(parseInt(document.getElementById("v1").value), parseInt(document.getElementById("v2").value));
}