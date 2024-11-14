package finalModule2.bt1.repo;

import finalModule2.bt1.entity.BenhAn;
import finalModule2.bt1.entity.BenhAnThuong;
import finalModule2.bt1.entity.BenAnVip;
import finalModule2.bt1.entity.BenhNhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRePo {
    private static List<BenhNhan> benhNhans = new ArrayList<>();

    public static List<BenhNhan> getBenhNhans() {
        List<BenhNhan> benhNhans = new ArrayList<>();
        File file = new File("module2/src/finalModule2/bt1/data/medical_records.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] data;
            while ((line = bufferedReader.readLine()) != null) {
                data = line.split(",");
                if (data.length < 7) {
                    System.err.println("Skipping invalid record (not enough columns): " + line);
                    continue;
                }
                String maBenhAn = data[0];
                String maBenhNhan = data[1];
                String tenBenhNhan = data[2];
                String ngayNhapVien = data[3];
                String ngayXuatVien = data[4];
                String chuanDoan = data[5];
                String benhAnType = data[6];
                String additionalData1 = "";
                String additionalData2 = "";
                if (data.length > 7) {
                    additionalData1 = data[7];
                }
                if (data.length > 8) {
                    additionalData2 = data[8];
                }
                BenhAn benhAn;
                if (benhAnType.equalsIgnoreCase("thuong")) {
                    double amount = 0.0;
                    if (!additionalData1.isEmpty()) {
                        amount = Double.parseDouble(additionalData1);
                    }
                    benhAn = new BenhAnThuong(maBenhAn, amount);
                } else if (benhAnType.equalsIgnoreCase("vip")) {
                    int vipDuration = 0;
                    if (!additionalData2.isEmpty()) {
                        vipDuration = Integer.parseInt(additionalData2);
                    }
                    benhAn = new BenAnVip(maBenhAn, additionalData1, vipDuration);
                } else {
                    System.err.println("Invalid record type (neither 'thuong' nor 'vip'): " + line);
                    continue;
                }
                BenhNhan benhNhan = new BenhNhan(maBenhNhan, tenBenhNhan, ngayNhapVien, ngayXuatVien, chuanDoan, benhAn);
                benhNhans.add(benhNhan);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("IO error: " + e.getMessage());
        }
        return benhNhans;
    }

    public static void deleteBenhNhan(String maBenhAn) {
        try {
            File file = new File("module2/src/finalModule2/bt1/data/medical_records.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line;
            boolean recordFound = false;

            while ((line = bufferedReader.readLine()) != null) {
                if (!line.startsWith(maBenhAn)) {
                    lines.add(line);
                } else {
                    recordFound = true;
                }
            }
            bufferedReader.close();

            if (!recordFound) {
                System.out.println("No records found with maBenhAn: " + maBenhAn);
                return;
            }

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (String record : lines) {
                bufferedWriter.write(record);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

            System.out.println("Record with maBenhAn " + maBenhAn + " deleted successfully.");
        } catch (IOException e) {
            throw new RuntimeException("Error while deleting record: " + e.getMessage());
        }
    }
}
