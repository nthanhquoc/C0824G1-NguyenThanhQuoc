package thuc_hanh;

public class MinArray {
    public static void main(String[] args) {
        int [] arr={4,12,7,8,1,6,9};
        int index=minValue(arr);
        System.out.println("Min is array at index "+index);
    }
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
