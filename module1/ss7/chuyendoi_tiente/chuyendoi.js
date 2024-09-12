let amount=document.getElementById('amount');
let fromCurry=document.getElementById('fromcurry');
let toCurry=document.getElementById('tocurry');
let resultBuild=document.getElementById('result');
let billingMoney;
function convertMoney(){
    let valueAmount=parseFloat(amount.value);
    if(fromCurry.value=='vietnam'&&toCurry.value=='usd'){
        billingMoney=valueAmount/24000;
        resultBuild.innerHTML="<h3>Convert tu "+valueAmount+" tu "+fromCurry.value+" to "+toCurry.value+" la "+ billingMoney+" </h3>";
    }
    else if(fromCurry.value=='usd'&&toCurry.value=='vietnam'){
        billingMoney=valueAmount*24000;
        resultBuild.innerHTML="<h3>Convert tu "+valueAmount+" tu "+fromCurry.value+" to "+toCurry.value+" la "+ billingMoney+" </h3>";
    }
    else{
        billingMoney=valueAmount;
        resultBuild.innerHTML="<h3>Convert tu "+valueAmount+" tu "+fromCurry.value+" to "+toCurry.value+" la "+ billingMoney+" </h3>";
    }
}