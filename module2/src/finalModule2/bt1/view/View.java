package finalModule2.bt1.view;

import finalModule2.bt1.controller.BenhNhanController;
import finalModule2.bt1.entity.BenhNhan;
import java.util.List;
import java.util.Scanner;

public class View {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nChuong Trinh Quan Ly Benh An");
            System.out.println("1. Thêm Mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem Danh Sách Benh An");
            System.out.println("4. Thoat");
            System.out.print("Chon Chuc Nang: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    deleteBenhNhan();
                    break;
                case 3:
                    showBenhNhans();
                    break;
                case 4:
                    System.out.println("Thoat Chuong Trinh");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
    private static void deleteBenhNhan() {
        System.out.println("Nhap Ma Benh Nhan Can Xoa: ");
        String maBenhAn = sc.nextLine();
        if (isBenhNhanExist(maBenhAn)) {
            System.out.println("Ban Xac Nhan Muon Xoa 1.Yes|2.No");
            int subchoice=sc.nextInt();
            switch (subchoice) {
                case 1:
                    BenhNhanController.deleteBenhNhan(maBenhAn);
                    System.out.println("Xoa Benh Nhan Thanh Cong!");
                    break;
                    case 2:break;
            }
        } else {
            System.out.println("Ma Benh An Khong Ton Tai!");
        }
    }

    private static boolean isBenhNhanExist(String maBenhAn) {
        List<BenhNhan> benhNhans = BenhNhanController.getBenhNhans();
        for (BenhNhan benhNhan : benhNhans) {
            if (benhNhan.getBenhAn().getMaBenhAn().equals(maBenhAn)) {
                return true;
            }
        }
        return false;
    }


    private static void showBenhNhans() {
        List<BenhNhan> benhNhans = BenhNhanController.getBenhNhans();
        if (benhNhans.isEmpty()) {
            System.out.println("Khong co benh nhan nao.");
        } else {
            System.out.println("Danh Sach Benh An:");
            for (BenhNhan bn : benhNhans) {
                System.out.println(bn);
            }
        }
    }
}
