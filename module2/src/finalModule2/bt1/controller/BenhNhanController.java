package finalModule2.bt1.controller;

import finalModule2.bt1.entity.BenhNhan;
import finalModule2.bt1.service.BenhNhanService;
import finalModule2.bt1.service.IBenhNhanService;

import java.util.List;

public class BenhNhanController {
    private static IBenhNhanService benhNhanService = new BenhNhanService();

    public static List<BenhNhan> getBenhNhans() {
        return benhNhanService.getBenhNhans();
    }

//    public static void addBenhNhan(BenhNhan benhNhan) {
//        benhNhanService.addBenhNhan(benhNhan);
//    }

    public static void deleteBenhNhan(String maBenhAn) {
        benhNhanService.deleteBenhNhan(maBenhAn);
    }
}
