package bai_tap.io_file.bt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCountry {
    public static void main(String[] args) {
        String filePath = "module2/src/bai_tap/io_file/bt2/file.csv";
        List<Country> countries = readCountry(filePath);
        System.out.println(Country.printCountries(countries));
    }

    public static List<Country> readCountry(String filePath) {
        List<Country> countries = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String code = values[1].replace("\"", "");
                String name = values[2].replace("\"", "");
                Country country = new Country(id, code, name);
                countries.add(country);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file CSV: " + e.getMessage());
        }
        return countries;
    }
}

