package DataStructures;

import java.util.Arrays;

public class MyLinkedList {

    private Node head;
    private int size;

    public void add(int value){
        if (head == null){
            this.head = new Node(value);
        }else {
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index){
        int currentIndex = 0;
        Node temp = head;

        while (temp != null){
            if (currentIndex == index){
                return temp.getValue();
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index){
        int currentIndex = 0;
        Node temp = head;

        if (index == 0){
            head = temp.getNext();
            size--;
            return;
        }



        while (temp != null){
            if ( (currentIndex + 1) == index){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }


    }

    @Override
    public String toString(){
        int[] result = new int[size];
        int index = 0;
        Node temp = head;
        while (temp != null){
            result[index++] = temp.getValue();
            temp = temp.getNext();

        }
        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
