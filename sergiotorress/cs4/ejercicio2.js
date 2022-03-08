let array = [1, 2, 4, 5];

function doubleV(a) {
    for(let i=0; i<a.length; i++){
        a[i]=a[i]*2;
    }
    console.log(a.join(" "));
}

doubleV(array);