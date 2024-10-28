package thuc_hanh.sort;

public class BubbleSort {
    static int []list = {2,3,2,5,6,1,-2,3,14,12};
    public static void bubbleSort(int[]list) {
        boolean needNextPass = true;
        for(int k=1;k<list.length&&needNextPass;k++) {
            needNextPass = false;
            for(int j=0;j<list.length-k;j++) {
                if(list[j]>list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for(int i=0;i<list.length;i++) {
            System.out.println(list[i]+"");
        }
    }
}
