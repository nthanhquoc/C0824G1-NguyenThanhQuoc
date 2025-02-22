package thuc_hanh.Io_file.bt2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<Integer>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            while((line=br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.err.println("File khong ton tai!");
        }
        return numbers;
    }
    public void writeFile(String filePath,int max){
        try{
            FileWriter writer=new FileWriter(filePath);
            BufferedWriter bw=new BufferedWriter(writer);
            bw.write("Giá Trị Lớn Nhất là "+ max);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
