create database baitap2;
use baitap2;
create table phieu_xuat(
so_px int auto_increment,
ngay_xuat date not null,
primary key (so_px)
);
create table vat_tu(
ma_vat_tu int auto_increment,
ten_vat_tu varchar(20) not null,
primary key(ma_vat_tu)
);

create table chi_tiet_phieu_xuat(
so_px int,
ma_vat_tu int,
dg_xuat int not null,
sl_xuat int not null,
primary key(so_px,ma_vat_tu),
foreign key(so_px) references phieu_xuat (so_px),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table phieu_nhap(
so_pn int auto_increment,
ngay_nhap date not null,
primary key(so_pn)
);

create table chi_tiet_phieu_nhap(
so_pn int,
ma_vat_tu int,
gd_nhap int not null,
sl_nhap int not null,
primary key (so_pn,ma_vat_tu),
foreign key (so_pn) references phieu_nhap(so_pn),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table don_dh(
so_dh int auto_increment,
ngay_dh date not null,
ma_ncc int,
primary key(so_dh),
foreign key(ma_ncc) references nhacc(ma_ncc)
);

create table chi_tiet_don_dh(
ma_vat_tu int,
so_hd int,
primary key(ma_vat_tu,so_hd),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_hd) references don_dh(so_dh)
);

create table nhacc(
ma_ncc int auto_increment,
ten_ncc varchar(50) not null,
dia_chi varchar(100) not null,
primary key (ma_ncc)
);

create table sdt(
ma_ncc int,
sdt varchar(11),
primary key(ma_ncc,sdt),
foreign key (ma_ncc) references nhacc(ma_ncc)
);