package bai_tap.dsa.bt2;

import bai_tap.dsa.bt1.MyList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("index: " + index + " NumNode: " + numNodes);
        }
        if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(element);
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("index: " + index + " NumNode: " + numNodes);
        }
        if (index == 0) {
            Node temp = head;
            head = head.next;
            numNodes--;
            return (E) temp.data;
        } else {
            Node previouse = head;
            for (int i = 0; i < index; i++) {
                previouse = previouse.next;
            }
            Node temp = previouse.next;
            previouse.next = temp.next;
            numNodes--;
            return (E) temp.data;
        }
    }

    public boolean remove(Object element) {
        Node current = head;
        Node previouse = null;
        while (current != null) {
            if (current.data.equals(element)) {
                if (previouse == null) {
                    head = head.next;
                } else {
                    previouse.next = current.next;
                }
                numNodes--;
                return true;
            }
            previouse = current;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clonedList= new MyLinkedList<>();
        Node current = head;
        while (current != null) {
            clonedList.addLast((E) current.data);
            current = current.next;
        }
        return clonedList;
    }

    public boolean contains(E element) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int indexOf(E element) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(element)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean add(E element) {
        
    }
    public void ensureCapacity(int minCapacity) {

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
}
