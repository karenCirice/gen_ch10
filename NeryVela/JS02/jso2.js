function myfunction(){
  let i= parseFloat(document.getElementById("a_1").value);
  let j= parseFloat(document.getElementById("b_1").value);
  let sum=i+j;
  document.getElementById("c_1").innerHTML = sum;
}

function myfunction_1(){
  let i= parseFloat(document.getElementById("a_1").value);
  let j= parseFloat(document.getElementById("b_1").value);
  let res=i-j;
  document.getElementById("c_1").innerHTML = res;
}

function myfunction_2(){
  let i= parseFloat(document.getElementById("a_1").value);
  let j= parseFloat(document.getElementById("b_1").value);
  let mul=i*j;
  document.getElementById("c_1").innerHTML = mul;
}

function myfunction_3(){
  let i= parseFloat(document.getElementById("a_1").value);
  let j= parseFloat(document.getElementById("b_1").value);
  let div=i/j;
  document.getElementById("c_1").innerHTML = div;
}

