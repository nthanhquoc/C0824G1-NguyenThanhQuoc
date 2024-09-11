let diem_toan= document.getElementById('toan');
let diem_van=document.getElementById('van');
let diem_anh = document.getElementById('anh');
let hien_thi=document.getElementById('hienthi');
let btnButton=document.getElementById('btn');
btnButton.addEventListener('click', function(){
    let toan=parseFloat(diem_toan.value);
    // alert(typeof toan)
    let van =parseFloat(diem_van.value);
    // alert(typeof van)
    let anh = parseFloat(diem_anh.value);
    // alert(typeof anh);
    let avg= (toan+van+anh)/3;
    alert('Diem Trung Binh La : '+avg);
    hien_thi.innerHTML="Toan "+toan+"<br>"+"Van "+van+"<br>"+"Anh:"+anh+"<br>"+"Diem Trung Binh: "+avg;


})
