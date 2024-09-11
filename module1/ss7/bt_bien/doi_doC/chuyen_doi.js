let cel=document.getElementById("celsius");
let res=document.getElementById("result");
function chuyendoi(){
    let cel_num=parseInt(cel.value);
    let change=(cel_num * 9/5) + 32;
    res.innerHTML="Result : "+change;
}