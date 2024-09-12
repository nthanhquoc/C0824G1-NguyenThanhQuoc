let firstNumber=document.getElementById('number1');
let secondNumber=document.getElementById('number2');
let resultCaculator=document.getElementById('result');

function addition(){
    let parseFirstNumber=parseFloat(firstNumber.value);
    let parseSecondNumber=parseFloat(secondNumber.value);
    let numberAddition=parseFirstNumber+parseSecondNumber;
    resultCaculator.innerHTML="Caculator: "+numberAddition+" ";
}

function subtraction(){
    let parseFirstNumber=parseFloat(firstNumber.value);
    let parseSecondNumber=parseFloat(secondNumber.value);
    let numberAddition=parseFirstNumber-parseSecondNumber;
    resultCaculator.innerHTML="Caculator: "+numberAddition+" ";
}

function multip(){
    let parseFirstNumber=parseFloat(firstNumber.value);
    let parseSecondNumber=parseFloat(secondNumber.value);
    let numberAddition=parseFirstNumber*parseSecondNumber;
    resultCaculator.innerHTML="Caculator: "+numberAddition+" ";
}

function division(){
    let parseFirstNumber=parseFloat(firstNumber.value);
    let parseSecondNumber=parseFloat(secondNumber.value);
    let numberAddition=parseFirstNumber/parseSecondNumber;
    resultCaculator.innerHTML="Caculator: "+numberAddition+" ";

}
