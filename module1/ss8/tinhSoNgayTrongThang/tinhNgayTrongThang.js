let monthInput=document.getElementById('monthInput');
let btnCalculation=document.getElementById('btnCalculation');
let resultText=document.getElementById('resultText');

function calculationDate(){
    let monthInputValue=parseInt(monthInput.value);
    switch (monthInputValue){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            resultText.innerHTML=`<h3>Thang ${monthInputValue} co 31 Ngay</h3>`;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            resultText.innerHTML=`<h3>Thang ${monthInputValue} co 30 Ngay</h3>`;
            break;
        case 2:
            resultText.innerHTML=`<h3>Thang ${monthInputValue} co 28 Hoac 29 Ngay</h3>`;
            break;
        default:
            resultText.innerHTML="<h3>Khong Phai la Thang</h3>";
            break;

    }
}

