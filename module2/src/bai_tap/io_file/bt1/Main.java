package bai_tap.io_file.bt1;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sourcePath = "module2/src/bai_tap/io_file/bt1/number.txt";
        String targetPath = "module2/src/bai_tap/io_file/bt1/copy.txt";
        FileCopy fileCopy = new FileCopy(sourcePath, targetPath);
        List<Integer> numbers = fileCopy.readFile(sourcePath);
        fileCopy.writeFile(numbers);
    }
}
