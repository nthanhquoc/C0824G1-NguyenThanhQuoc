package bai_tap.dsa.bt2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.addFirst("C");
        myList.addLast("Java");
        myList.addLast("Python");
        myList.add(1, "C++");
        System.out.println("Danh sách sau khi thêm: ");
        DisplayList(myList);
        System.out.println("Số lượng phần tử: " + myList.size());
        System.out.println("Phần tử đầu tiên: " + myList.getFirst());
        System.out.println("Phần tử cuối cùng: " + myList.getLast());
        System.out.println("Danh sách có chứa Java không? " + myList.contains("Java"));
        System.out.println("Danh sách có chứa Ruby không? " + myList.contains("Ruby"));
        System.out.println("Xóa phần tử tại vị trí 2: " + myList.remove(2));
        System.out.println("Danh sách sau khi xóa: ");
        DisplayList(myList);
        System.out.println("Xóa phần tử 'C++': " + myList.remove("C++"));
        System.out.println("Danh sách sau khi xóa 'C++': ");
        DisplayList(myList);
        MyLinkedList<String> clonedList = myList.clone();
        System.out.println("Bản sao của danh sách: ");
        DisplayList(clonedList);
        myList.clear();
        System.out.println("Danh sách sau khi xóa toàn bộ: " + myList.size());
    }

    private static void DisplayList(MyLinkedList<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

}
