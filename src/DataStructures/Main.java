package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        //measureTime(linkedList);
        //measureTime(arrayList);

        //DataStructures.MyList<Integer> myArrayList = new DataStructures.MyArrayList<>();
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList.size());
        myArrayList.add(10);
        myArrayList.add(11);
        myArrayList.add(12);
        myArrayList.add(13);
        myArrayList.add(14);
        myArrayList.add(15);
        myArrayList.add(16);
        myArrayList.add(17);
        myArrayList.add(18);
        System.out.println(myArrayList.size());
        System.out.println("capacity: " + myArrayList.getCapacity());

        myArrayList.add(19);
        myArrayList.add(20);
        myArrayList.add(21);
        myArrayList.add(22);
        myArrayList.add(23);
        myArrayList.add(24);
        System.out.println(myArrayList.size());
        System.out.println("capacity: " + myArrayList.getCapacity());

        System.out.println(myArrayList.get(0));

        for (int i = 0; i < myArrayList.size(); i++){
            System.out.print(myArrayList.get(i) + " ");
        }

        myArrayList.remove(1);

        System.out.println("\ncapacity: " + myArrayList.getCapacity());
        System.out.println("size: " + myArrayList.size());
        for (int i = 0; i < myArrayList.size(); i++){
            System.out.print(myArrayList.get(i) + " ");
        }

        //Single Linked List
        System.out.println("\n");

        MySingleLinkedList<String> mySingleLinkedList = new MySingleLinkedList<>();
        mySingleLinkedList.add("Hello");
        System.out.println(mySingleLinkedList.head);

        mySingleLinkedList.add("World");
        System.out.println(mySingleLinkedList.head);

        mySingleLinkedList.add("!");
        System.out.println(mySingleLinkedList.head);

        mySingleLinkedList.add("?");
        System.out.println(mySingleLinkedList.head);

        mySingleLinkedList.add("ASDasdsad");
        System.out.println(mySingleLinkedList.head);

        mySingleLinkedList.add("fdsfdsfdsfdsfdsf");
        System.out.println(mySingleLinkedList.head);


        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println(myLinkedList);

        myLinkedList.remove(0);
        System.out.println(myLinkedList);

    }

    private static void measureTime(List<Integer> list){

//        for (int i = 0; i < 100_000; i++){
//            list.add(i);
//        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++){
            list.add(i);
        }
//        for (int i = 0; i < 100_000; i++){
//            list.get(i);
//        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
