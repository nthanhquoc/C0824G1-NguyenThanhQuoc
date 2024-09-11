let ly=document.getElementById('ly');
let hoa=document.getElementById('hoa');
let sinh=document.getElementById('sinh');
let hienthi=document.getElementById('hienthi');

function tinhdiem(){
    let diemly=parseFloat(ly.value);
    let diemhoa=parseFloat(hoa.value);
    let diemsinh=parseFloat(sinh.value);
    let avg=(diemly+diemhoa+diemsinh)/3;
    hienthi.innerHTML="<h3>Diem Trung Binh La : "+avg+"</h3>";
}

function tinhtong(){
    let diemly=parseFloat(ly.value);
    let diemhoa=parseFloat(hoa.value);
    let diemsinh=parseFloat(sinh.value);
    let sum= diemly+diemhoa+diemsinh;
    hienthi.innerHTML="<h3>Tong Cua 3 Diem la : "+sum+"</h3>";

}