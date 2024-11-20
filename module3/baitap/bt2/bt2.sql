create database baitap2;
use baitap2;
create table phieu_xuat(
so_phieu_xuat int auto_increment,
ngay_xuat date not null,
primary key (so_phieu_xuat)
);
create table vat_tu(
ma_vat_tu int auto_increment,
ten_vat_tu varchar(20) not null,
primary key(ma_vat_tu)
);

create table chi_tiet_phieu_xuat(
so_phieu_xuat int,
ma_vat_tu int,
dg_xuat int not null,
so_luong_xuat int not null,
primary key(so_phieu_xuat,ma_vat_tu),
foreign key(so_phieu_xuat) references phieu_xuat (so_phieu_xuat),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table phieu_nhap(
so_phieu_nhap int auto_increment,
ngay_nhap date not null,
primary key(so_phieu_nhap)
);

create table chi_tiet_phieu_nhap(
so_phieu_nhap int,
ma_vat_tu int,
gd_nhap int not null,
so_luong_nhap int not null,
primary key (so_phieu_nhap,ma_vat_tu),
foreign key (so_phieu_nhap) references phieu_nhap(so_phieu_nhap),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table don_dat_hang(
so_dat_hang int auto_increment,
ngay_dat_hang date not null,
ma_nha_cung_cap int,
primary key(so_dat_hang),
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);

create table chi_tiet_don_dat_hang(
ma_vat_tu int,
so_dat_hang int,
primary key(ma_vat_tu,so_hd),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_dat_hang) references don_dat_hang(so_dat_hang)
);

create table nha_cung_cap(
ma_nha_cung_cap int auto_increment,
ten_nha_cung_cap varchar(50) not null,
dia_chi varchar(100) not null,
primary key (ma_nha_cung_cap)
);

create table sdt(
ma_nha_cung_cap int,
sdt varchar(11),
primary key(ma_nha_cung_cap,sdt),
foreign key (ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);