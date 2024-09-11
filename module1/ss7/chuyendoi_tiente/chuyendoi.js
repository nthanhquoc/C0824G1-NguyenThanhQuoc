let amount=document.getElementById('number');
let fromCurry=document.getElementById('fromcurry');
let tocurry=document.getElementById('tocurry');
let resultBuild=document.getElementById('result');
let convertMoney
function chuyendoi(){
    let valueAmount=parseFloat(amount.value);
    if(fromCurry.value=='vietnam'&&tocurry.value=='usd'){
        convertMoney=valueAmount/24000;
        resultBuild.innerHTML="<h3>Convert tu "+valueAmount+" tu "+fromCurry.value+" to "+tocurry.value+" la "+ convertMoney+" </h3>";
        console.log(convertMoney);
    }
    else if(fromCurry.value=='usd'&&tocurry.value=='vietnam'){
        convertMoney=valueAmount*24000;
        resultBuild.innerHTML="<h3>Convert tu "+valueAmount+" tu "+fromCurry.value+" to "+tocurry.value+" la "+ convertMoney+" </h3>";
    }
    else{
        convertMoney=valueAmount;
        resultBuild.innerHTML="<h3>Convert tu "+valueAmount+" tu "+fromCurry.value+" to "+tocurry.value+" la "+ convertMoney+" </h3>";
    }
}