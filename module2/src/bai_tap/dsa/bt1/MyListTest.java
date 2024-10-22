package bai_tap.dsa.bt1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0,10);
        myList.add(1,20);
        myList.add(2,30);
        myList.add(3,40);

        System.out.println("Danh Sách Ban Đầu");
        displayArrayList(myList);
        System.out.println();
        System.out.println("Them Danh Sach");
        myList.add(1,30);
        displayArrayList(myList);
        System.out.println();

        System.out.println("Xoa Phan Tu Tai Danh Sach");
        myList.remove(1);
        displayArrayList(myList);
        System.out.println();

        boolean contains20 = myList.contains(20);
        System.out.println("Danh sách có chứa 20 không? " + contains20);

        boolean contains50 = myList.contains(50);
        System.out.println("Danh sách có chứa 50 không? " + contains50);

        MyList<Integer> cloneList = myList.clone();
        System.out.println("Danh Sách Sao Chép: ");
        displayArrayList(cloneList);
        System.out.println();

        myList.clear();
        System.out.println("Danh Sách Sau Khi Xóa: ");
        displayArrayList(myList);
        System.out.println("Kích thước của danh sách sau khi xóa: " + myList.size());
    }

    private static void displayArrayList(MyList<Integer> myList) {
        for(int i = 0; i < myList.size(); i++){
            System.out.print(myList.get(i)+" ");
        }
    }
}
