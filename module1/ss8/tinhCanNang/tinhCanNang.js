let numberOfWeight=document.getElementById('numberWeight');
let numberOfHeight=document.getElementById('numberHeight');
let resultInterpretation=document.getElementById('resultInterpretation');
let bmi;

function caculatorOfBmi(){
    let valueOfWeight=parseFloat(numberOfWeight.value);
    let valueOfHeight=parseFloat(numberOfHeight.value);
    bmi=valueOfWeight/(Math.pow(valueOfHeight,2));

    if(bmi<18.5){
        resultInterpretation.innerHTML="<h3>Underweight</h3>";
    }
    else if(bmi<25.0){
        resultInterpretation.innerHTML="<h3>Normal</h3>";
    }
    else if(bmi<30.0){
        resultInterpretation.innerHTML="<h3>Overweight</h3>";
    }
    else{
        resultInterpretation.innerHTML="<h3>Obese</h3>";
    }
}

