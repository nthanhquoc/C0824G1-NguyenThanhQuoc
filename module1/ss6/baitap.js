let diem_toan= document.getElementById('toan');


let diem_van=document.getElementById('van');

let diem_anh = document.getElementById('anh');

function tinhdiem(){
    let toan=parseInt(diem_toan.value);
    //alert(typeof toan)
    let van =parseInt(diem_van.value);
    //alert(typeof van)
    let anh = parseInt(diem_anh.value);
    //alert(typeof anh);
     let avg= (toan+van+anh)/3;
     alert('Diem Trung Binh La : '+avg);
}