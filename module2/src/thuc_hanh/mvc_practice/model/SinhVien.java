package thuc_hanh.mvc_practice.model;

public class SinhVien {
    private String ten;
    private String maSV;

    public SinhVien(String ten, String maSV) {
        this.ten = ten;
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
}