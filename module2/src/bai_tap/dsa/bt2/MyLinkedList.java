package bai_tap.dsa.bt2;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        this.numNodes = 0;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element);
        if (index == 0) {
            addFirst(element);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            ;
            prev.next = newNode;
            this.numNodes++;
        }
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        this.numNodes++;

    }

    public void addLast(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node prev = head;
            while (prev.next != null) {
                prev = prev.next;
            }
            prev.next = newNode;
        }
        this.numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        if (index == 0) {
            head = head.next;
        } else {
            Node pre = null;
            for (int i = 0; i < index - 1; i++) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = temp.next;
        }
        numNodes--;
        return (E) temp.data;
    }

    public boolean remove(Object element) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(element)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null && !temp.data.equals(element)) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) {
            prev.next = temp.next;
            numNodes--;
            return true;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        if(head==null){
            return clone;
        }
        Node temp = head;
        clone.addFirst((E) temp.data);
        Node cloneTemp=clone.head;
        temp=temp.next;
        while(temp!=null){
            cloneTemp.next=new Node(temp.data);
            cloneTemp=cloneTemp.next;
            temp=temp.next;
        }
        clone.numNodes=this.numNodes;
        return clone;
    }

    public boolean contains(E o) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public boolean add(E element) {
        addLast(element);
        return true;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        if(head==null){
            return null;
        }
        return (E) head.data;
    }

    public E getLast() {
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

}
