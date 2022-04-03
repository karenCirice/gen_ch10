//Funciones ligadas al inputo por el boton, atraves del id. parseInt devuelve numero, document.getElementById (Id o clase). Value para que value retorne una asignacion de numero.
let suma = ()=>{
document.getElementById("res").value= (((parseInt( document.getElementById("n1").value)) + (parseInt( document.getElementById("n2").value)))) 
};
let resta = ()=>{
document.getElementById("res").value= (((parseInt( document.getElementById("n1").value)) - (parseInt( document.getElementById("n2").value))))  
};
let mult = ()=>{
document.getElementById("res").value= (((parseInt( document.getElementById("n1").value)) * (parseInt( document.getElementById("n2").value)))) 
};
let div = ()=>{
document.getElementById("res").value= (((parseInt( document.getElementById("n1").value)) / (parseInt( document.getElementById("n2").value)))) 
};
//limpia con una reasignacion en los id a espacio en blanco
let reset = ()=>{
  document.getElementById("res").value=""
  document.getElementById("n1").value=""
  document.getElementById("n2").value=""  
  };
/* Mejorar este script, para poder pasar la reproduccion automatica, miercoles 9:20 pm 
  let boton = document.querySelector(".btn")
  let audioEtiqueta = document.querySelector("audio")

  boton.addEventListener("click", () => {
    audioEtiqueta.setAttribute("src", "son.mp3")
    audioEtiqueta.play()
    //console.log(Reproduciendo: ${audioEtiqueta.src})
  })*/