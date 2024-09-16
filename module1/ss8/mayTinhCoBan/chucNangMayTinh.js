let displayValues=document.getElementById("displayValues");
let btnValues=document.getElementsByClassName('btn');

for(let i=0;i<btnValues.length;i++){
    btnValues[i].addEventListener('click', function(){
        displayValues.innerHTML +=btnValues[i].value;
    })
}

function equal(){
    let res=displayValues.innerHTML;
    let output=eval(res);
    displayValues.innerHTML=output;
}
function clean(){
    displayValues.innerHTML="";
}