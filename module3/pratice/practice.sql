create database practice;
use practice;

create table vi_tri(
id_vi_tri int unique,
ten_vi_tri varchar(45),
primary key(id_vi_tri)
);
create table trinh_do(
id_trinh_do int unique,
trinh_do varchar(45),
primary key(id_trinh_do)
);
create table bo_phan(
id_bo_phan int unique,
ten_bo_phan varchar(45),
primary key (id_bo_phan)
);
create table nhan_vien(
id_nhan_vien int unique,
ho_ten varchar(45),
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ngay_sinh date,
so_cmtnd varchar(45),
sdt varchar(11),
email varchar(45),
dia_chi varchar(45),
primary key(id_nhan_vien),
foreign key (id_vi_tri) references vi_tri(id_vi_tri),
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
foreign key(id_bo_phan) references bo_phan(id_bo_phan)
);

create table loai_khach(
id_loai_khach int unique,
ten_loaikhach varchar(45),
primary key (id_loai_khach)
);

create table khach_hang(
id_khach_hang int unique,
id_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
so_cmtnd varchar(45),
sdt varchar(11),
email varchar(45),
dia_chi varchar(45),
primary key (id_khach_hang),
foreign key(id_loai_khach) references loai_khach(id_loai_khach)
);

create table kieu_thue(
id_kieu_thue int unique,
ten_kieu_thue varchar(45),
gia int,
primary key (id_kieu_thue)
);

create table loai_dich_vu(
id_loai_dich_vu int unique,
ten_loai_dich_vu varchar(45),
primary key (id_loai_dich_vu)
);

create table dich_vu(
id_dich_vu int unique,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da int,
chi_phi_thue int,
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai varchar(45),
primary key (id_dich_vu),
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue),
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu)
);

create table hop_dong(
id_hop_dong int unique,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int,
primary key (id_hop_dong),
foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key (id_khach_hang) references khach_hang(id_khach_hang),
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);

create table dich_vu_di_kem(
id_dich_vu_di_kem int unique,
ten_dich_vu_di_kem varchar(45),
gia int,
don_vi varchar(5),
trang_thai_kha_dung varchar(45),
primary key (id_dich_vu_di_kem)
);

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int unique,
id_hop_dong int,
id_dich_vu_di_kem int,
soluong int,
primary key (id_hop_dong_chi_tiet),
foreign key (id_hop_dong) references hop_dong(id_hop_dong),
foreign key(id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem)
);

select * from nhan_vien where (ho_ten Like 'H%' or ho_ten Like 'T%' or ho_ten like 'K%') And length(ho_ten)<=15;

select * 
from khach_hang where DATEDIFF(current_date(),ngay_sinh)/365 between 18 and 50 
and (dia_chi = 'Đà Nẵng' or dia_chi ='Quảng Trị');

select khach_hang.ho_ten,loai_khach.ten_loaikhach, count(hop_dong.id_hop_dong) as so_lan_dat_phong
from khach_hang
join loai_khach on loai_khach.id_loai_khach=khach_hang.id_loai_khach
join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
where loai_khach.ten_loaikhach="Diamond"
group by khach_hang.ho_ten,loai_khach.ten_loaikhach
order by so_lan_dat_phong asc;

select khach_hang.id_khach_hang,khach_hang.ho_ten,loai_khach.ten_loaikhach,hop_dong.id_hop_dong,dich_vu.ten_dich_vu,
hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc,(dich_vu.chi_phi_thue+hop_dong_chi_tiet.soluong *dich_vu_di_kem.gia) as "tong tien"
from khach_hang
left join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
left join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
left join dich_vu on hop_dong.id_dich_vu=dich_vu.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem;


