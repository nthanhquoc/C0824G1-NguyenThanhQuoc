package finalModule2.bt1.entity;

public class BenAnVip extends BenhAn {
    private String loaiVip;
    private int thoiHanVip;

    public BenAnVip(String maBenhAn, String loaiVip, int thoiHanVip) {
        super(maBenhAn);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public int getThoiHanVip() {
        return thoiHanVip;
    }

    @Override
    public String toString() {
        return "Benh An VIP [Ma Benh An: " + getMaBenhAn() + ", Loai VIP: " + loaiVip + ", Thoi Han VIP: " + thoiHanVip + " ngay]";
    }
}
