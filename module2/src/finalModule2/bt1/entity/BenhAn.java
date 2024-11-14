package finalModule2.bt1.entity;

public abstract class BenhAn {
    private String maBenhAn;

    public BenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    @Override
    public abstract String toString();
}
