function obtenerFormulario() {
    let formulario = document.forms["formulario"];
    console.log(formulario);
    let concatenacion = "";
    for (const elem of formulario) {
        concatenacion += " " + elem.value;
    }
    console.log(concatenacion);
    console.log(formulario["nombre"]["value"]);
    console.log(formulario["apellido"]["value"]);
    localStorage.setItem(formulario["nombre"]["name"], formulario["nombre"]["value"]);
    localStorage.setItem(formulario["apellido"]["name"], formulario["apellido"]["value"]);
}
function recuperarFormulario() {
    let formulario = document.forms["formulario"];
    formulario["nombre"]["value"] = localStorage.getItem(formulario["nombre"]["name"]);

    formulario["apellido"]["value"] = localStorage.getItem(formulario["apellido"]["name"]);
}
function recordatorio() {
    let array = ["dato1", "dato2", "dato3"];
    let objeto = {
        clave1: "dato1",
        clave2: ["dato1", "dato2", "dato3"],
        clave3: {
            clavec: "datoc",
            claver: "dator",
        }
    };
}