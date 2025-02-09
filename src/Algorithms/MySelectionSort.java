package Algorithms;

import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    /*[5, 3, 8, 4, 2] i 0
      2 [8, 4, 5] i 1
      2 3 [4, 8, 5] i 2
      2 3 4  [8, 5] i 3
     */
    private static void selectionSort(int [] array){
        for (int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            int minValue = array[minIndex];

            for (int j = i + 1; j < array.length; j++){
                if (minValue > array[j]){
                    minIndex = j;
                    minValue = array[j];
                }
            }
            int temp = array[i];
            array[i] = minValue;
            array[minIndex] = temp;
        }
    }
}
