package bai_tap.io_file.bt2;

import java.util.List;

public class Country {
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("│ %-10d │ %-14s │%-19s │%n", id, code, name);
    }

    public static String printCountries(List<Country> countries) {
        StringBuilder sb = new StringBuilder();
        sb.append("Danh sách các quốc gia:\n");
        sb.append(
                "┌────────────┬────────────────┬─────────────────────┐\n" +
                        "│    ID      │      Code      │      Name          │\n" +
                        "├────────────┼────────────────┼─────────────────────┤\n"
        );
        for (Country country : countries) {
            sb.append(country.toString());
        }
        sb.append("└────────────┴────────────────┴─────────────────────┘");
        return sb.toString();
    }
}
