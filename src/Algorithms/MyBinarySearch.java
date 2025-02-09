package Algorithms;

public class MyBinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {1};
        binarySearch(sortedArray, 5);
    }

    private static void binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int middleIndex = (low + high) / 2;
            int middle = array[middleIndex];
            if (target == middle){
                System.out.println("Item required. This item index is: " + middleIndex);
                return;
            }
            if (target > middle){
                low = middleIndex + 1;
            } else {
                high = middleIndex - 1;
            }
        }

        System.out.println("Item not found");;
    }
}
