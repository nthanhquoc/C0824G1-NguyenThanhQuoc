let firstNumber=document.getElementById('number1');
let secondNumber=document.getElementById('number2');
let resultCaculator=document.getElementById('result');
let buttonCaculator=document.getElementsByClassName('btn');
let caculation;

    for(let i=0;i<buttonCaculator.length;i++){
        buttonCaculator[i].addEventListener('click', function(){
            let parseFirstNumber=parseFloat(firstNumber.value);
            let parseSecondNumber=parseFloat(secondNumber.value);
            switch (buttonCaculator[i].value) {
                    case '+':
                        caculation=parseFirstNumber + parseSecondNumber;
                        resultCaculator.innerHTML="Caculator: "+caculation+" ";
                        break;
                    case '-':
                        caculation=parseFirstNumber - parseSecondNumber;
                        resultCaculator.innerHTML="Caculator: "+caculation+" ";
                        break;
                    case '*':
                        caculation=parseFirstNumber * parseSecondNumber;
                        resultCaculator.innerHTML="Caculator: "+caculation+" ";
                        break;
                    case'/':
                        if(parseSecondNumber==0){
                            alert("Lỗi");
                            break;
                        }
                        else{
                            caculation=parseFirstNumber / parseSecondNumber;
                            resultCaculator.innerHTML="Caculator: "+caculation+" ";
                        }
                        break;
            }
        })
    }
