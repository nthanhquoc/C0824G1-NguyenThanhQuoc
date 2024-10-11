package bai_tap.class_practice.ex2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[]arr=new int[100000];
        Random rand=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100);
        }
        StopWatch sw=new StopWatch();
        sw.start();
        selectionSort(arr);
        sw.stop();
        System.out.println("Thời gian thực thi của thuật toán Selection Sort: " + sw.getElapsedTime() + " milliseconds");
    }
    public static void selectionSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}
