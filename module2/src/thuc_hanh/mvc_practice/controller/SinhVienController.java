package thuc_hanh.mvc_practice.controller;
import thuc_hanh.mvc_practice.model.SinhVien;
import thuc_hanh.mvc_practice.view.SinhVienView;

public class SinhVienController {
    private SinhVien model;
    private SinhVienView view;

    public SinhVienController(SinhVien model, SinhVienView view) {
        this.model = model;
        this.view = view;
    }

    public void setTenSinhVien(String ten) {
        model.setTen(ten);
    }

    public String getTenSinhVien() {
        return model.getTen();
    }

    public void setMaSinhVien(String maSV) {
        model.setMaSV(maSV);
    }

    public String getMaSinhVien() {
        return model.getMaSV();
    }

    public void capNhatView() {
        view.inThongTinSinhVien(model.getTen(), model.getMaSV());
    }
}
