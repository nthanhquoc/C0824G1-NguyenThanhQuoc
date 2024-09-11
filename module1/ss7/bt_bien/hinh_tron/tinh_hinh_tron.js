let banKinh=document.getElementById("bankinh");
let hienThi=document.getElementById("hienthi");
const pi=Math.PI;

function tinhDienTich(){
    let chuyenBanKinh=parseInt(banKinh.value);
    let congThuc=chuyenBanKinh*chuyenBanKinh*pi;
    //console.log(congThuc);
    hienthi.innerHTML="Dien Tich : "+congThuc;
}

function tinhChuVi(){
    let chuyenBanKinh=parseInt(banKinh.value);
    let congThuc=chuyenBanKinh*2*pi;
    hienThi.innerHTML="Chu Vi : "+congThuc;
}

function resetBtn(){
    hienThi.innerHTML=" ";
    banKinh.value="";
}