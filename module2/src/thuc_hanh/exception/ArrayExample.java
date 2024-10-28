package thuc_hanh.exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd =new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh Sach Phan Tu Cua Mang: ");
        for(int i=0;i<100;i++){
            arr[i]=rd.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        Integer[] arr = example.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui Long Nhap Chi so cua 1 phan tu bat ky");
        int x=sc.nextInt();
        try{
            System.out.println("Gia tri cua phan tu co chi so "+x+" la "+arr[x]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Chi So vuot qua gioi han qua mang");
        }
    }
}
