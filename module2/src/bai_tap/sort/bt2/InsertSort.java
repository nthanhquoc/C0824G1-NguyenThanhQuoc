package bai_tap.sort.bt2;

public class InsertSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int []arr={4,5,1,3,2,6};
        insertionSort(arr);
        System.out.println("Array after insertion sort");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
