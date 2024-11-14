package finalModule2.bt1.entity;

public class BenhNhan {
    private static int soThuTuBenhAnCounter = 0;
    private int soThuTuBenhAn;
    private String maBenhAn;
    private String tenBenhNhan;
    private String ngayNhapVien;
    private String ngayRavien;
    private String lyDo;
    private BenhAn benhAn;

    public BenhNhan(String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRavien, String lyDo, BenhAn benhAn) {
        this.soThuTuBenhAn = ++soThuTuBenhAnCounter;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRavien = ngayRavien;
        this.lyDo = lyDo;
        this.benhAn = benhAn;
    }

    public int getSoThuTuBenhAn() {
        return soThuTuBenhAn;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public String getNgayRavien() {
        return ngayRavien;
    }

    public String getLyDo() {
        return lyDo;
    }

    public BenhAn getBenhAn() {
        return benhAn;
    }

    @Override
    public String toString() {
        return "Benh Nhan [So Thu Tu Benh An: " + soThuTuBenhAn + ", Ma Benh An: " + maBenhAn +
                ", Ten Benh Nhan: " + tenBenhNhan + ", Ngay Nhap Vien: " + ngayNhapVien +
                ", Ngay Ra Vien: " + ngayRavien + ", Ly Do: " + lyDo + ", " + benhAn + "]";
    }
}
