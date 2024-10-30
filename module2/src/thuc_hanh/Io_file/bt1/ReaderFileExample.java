package thuc_hanh.Io_file.bt1;

import java.io.*;
import java.util.Scanner;

public class ReaderFileExample {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum = "+sum);
        } catch (IOException e) {
            System.err.println("File khong ton tai");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap Duong dan file");
        Scanner sc = new Scanner(System.in);
        String path =sc.nextLine();
        ReaderFileExample reader = new ReaderFileExample();
        reader.readFileText(path);
    }
}
