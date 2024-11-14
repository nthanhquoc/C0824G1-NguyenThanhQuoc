package finalModule2.bt1.service;

import finalModule2.bt1.entity.BenhNhan;
import finalModule2.bt1.repo.BenhNhanRePo;

import java.util.List;

public class BenhNhanService implements IBenhNhanService {
    private static BenhNhanRePo repo = new BenhNhanRePo();

    @Override
    public List<BenhNhan> getBenhNhans() {
        return repo.getBenhNhans();
    }

//    @Override
//    public void addBenhNhan(BenhNhan benhNhan) {
//        repo.addBenhNhan(benhNhan);
//    }

    @Override
    public void deleteBenhNhan(String maBenhAn) {
        repo.deleteBenhNhan(maBenhAn);
    }
}
