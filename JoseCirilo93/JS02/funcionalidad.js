/**
 * la fuction suma es una fución flecha
 * @param {number} ingresarA //Es donde se ingresa un valor numerico
 * @param {number} ingresarB //Es donde se ingresa un valor numerico
 * Como puedes ver, (a1, b2) => a1 + b2 significa una función que acepta dos argumentos llamados a1 y b2. 
 * Tras la ejecución, evalúa la expresión a1 + b2 y devuelve el resultado.
 */
function suma() {
   const d = (a1, b2) => a1 + b2;
   document.getElementById("resultado").value = d(parseInt(document.getElementById("ingresarA").value), parseInt(document.getElementById("ingresarB").value));
}

/**La fuction resta
* @param {number} ingresarA //Es donde se ingresa un valor numerico
* @param {number} ingresarB //Es donde se ingresa un valor numerico
* @ Como puedes ver, significa una función que acepta dos argumentos llamados ingresarA y ingresarB. 
* Tras la ejecución, evalúa la expresión ingresarA - ingresarB y devuelve el resultado.
* Usamos el signo menos ( - ) para restar números o variables que representan números.
*/
function resta() {
   let ingresarA = parseInt(document.getElementById("ingresarA").value);
   let ingresarB = parseInt(document.getElementById("ingresarB").value);
   let resultado = ingresarA - ingresarB;
   document.getElementById("resultado").value = resultado;
}

/**
* la fuction division es una fución flecha
* @param {number} ingresarA //Es donde se ingresa un valor numerico
* @param {number} ingresarB //Es donde se ingresa un valor numerico
*@ Como puedes ver, (a, b) => a / b significa una función que acepta dos argumentos llamados a y b. 
* Tras la ejecución, evalúa la expresión a / b y devuelve el resultado.
*/
function division() {
   const c = (a, b) => a / b;
   document.getElementById("resultado").value = c(parseInt(document.getElementById("ingresarA").value), parseInt(document.getElementById("ingresarB").value));
}

/**La fuction multiplicación
* @param {number} ingresarA //Es donde se ingresa un valor numerico
* @param {number} ingresarB //Es donde se ingresa un valor numerico
* @ Como puedes ver, significa una función que acepta dos argumentos llamados ingresarA y ingresarB. 
* Tras la ejecución, evalúa la expresión ingresarA * ingresarB y devuelve el resultado.
* Se utiliza un asterisco ( * ) para representar el operador de multiplicación.
*/
function multiplicación() {
   let ingresarA = parseInt(document.getElementById("ingresarA").value);
   let ingresarB = parseInt(document.getElementById("ingresarB").value);
   let resultado = ingresarA * ingresarB;
   document.getElementById("resultado").value = resultado;
}

