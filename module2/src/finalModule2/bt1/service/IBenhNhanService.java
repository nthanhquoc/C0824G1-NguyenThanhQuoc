package finalModule2.bt1.service;

import finalModule2.bt1.entity.BenhNhan;

import java.util.List;

public interface IBenhNhanService {
    List<BenhNhan> getBenhNhans();
//    void addBenhNhan(BenhNhan benhNhan);
    void deleteBenhNhan(String maBenhAn);
}
