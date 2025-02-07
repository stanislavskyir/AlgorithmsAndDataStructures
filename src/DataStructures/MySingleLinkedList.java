package DataStructures;

public class MySingleLinkedList<T> {

    Node<T> head = null;

    public void add(T string) {
        if (head == null) {
            head = new Node<T>(string);
        } else {
            Node<T> temp = head;
            while (temp.next != null){
                temp = temp.next;
            }

            temp.next = new Node<T>(string);
//            Node temp = head.next;
//            while (temp != null){
//                if (temp.next == null){
//                    temp.next = new Node(string);
//                    return;
//                }
//                else {
//                    temp = temp.next;
//                }
//            }
//
//            if (head.next == null){
//                head.next = new Node(string);
//            }
        }
    }

    private static class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T string) {
            data = string;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    ", next=" + next +
                    '}';
        }
    }
}
