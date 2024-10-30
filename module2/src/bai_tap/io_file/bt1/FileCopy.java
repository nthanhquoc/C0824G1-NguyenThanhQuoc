package bai_tap.io_file.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {
    private String sourceFilePath;
    private String targetFilePath;

    public FileCopy(String sourceFilePath, String targetFilePath) {
        this.sourceFilePath = sourceFilePath;
        this.targetFilePath = targetFilePath;
    }

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<Integer>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File khong ton tai!");
        }
        return numbers;
    }

    public void writeFile(List<Integer> numbers) {
        try {
            File targetFile = new File(targetFilePath);
            if (targetFile.exists()) {
                System.err.println("Tệp đích đã tồn tại.");
                return;
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
            int charCount = 0;
            for (Integer number : numbers) {
                String line = number.toString();
                bw.write(line);
                bw.newLine();
                charCount += line.length() + 1;
            }
            bw.close();
            System.out.println("Đã sao chép " + charCount + " ký tự từ tệp nguồn sang tệp đích.");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi vào file đích.");
        }
    }

    public static void main(String[] args) {
        String sourcePath = "module2/src/bai_tap/io_file/bt1/number.txt";
        String targetPath = "module2/src/bai_tap/io_file/bt1/copy.txt";
        FileCopy fileCopy = new FileCopy(sourcePath, targetPath);

        List<Integer> numbers = fileCopy.readFile(sourcePath);
        fileCopy.writeFile(numbers);
    }
}
