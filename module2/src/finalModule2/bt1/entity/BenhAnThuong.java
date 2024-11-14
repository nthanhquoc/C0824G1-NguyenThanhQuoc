package finalModule2.bt1.entity;

public class BenhAnThuong extends BenhAn {
    private double phiNamVien;

    public BenhAnThuong(String maBenhAn, double phiNamVien) {
        super(maBenhAn);
        this.phiNamVien = phiNamVien;
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    @Override
    public String toString() {
        return "Benh An Thuong [Ma Benh An: " + getMaBenhAn() + ", Phi Nam Vien: " + phiNamVien + "]";
    }
}
