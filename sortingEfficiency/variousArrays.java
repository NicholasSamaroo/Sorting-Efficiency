package sortingEfficiency;

import java.util.Random;

public class variousArrays {
    private int[] unifiedArray;

    public int[] randomArray(int size) {
        unifiedArray = new int[size];
        Random generator = new Random();

        for (int i = 0; i < size; i++) {
            unifiedArray[i] = generator.nextInt(size) + 1;
        }
        return unifiedArray;
    }

    public int[] ascendingArray(int size) {
        unifiedArray = new int[size];
        for (int i = 0; i < size; i++) {
            unifiedArray[i] = i;
        }
        return unifiedArray;

    }

    public int[] descendingArray(int size) {
        unifiedArray = new int[size];
        int length = size - 1;
        for (int i = 0; i < size; i++) {
            unifiedArray[i] = length;
            length--;
        }
        return unifiedArray;

    }
}
