package sortingEfficiency;

import java.lang.*;

public class sorts {
    private long startTime;
    private long endTime;
    private long elapsedTime;
    private double timeInSeconds;
    private final int seconds = 1000000000;

    public double insertionSort(int[] variousArray) {
        int holder;
        startTime = System.nanoTime();

        for (int i = 1; i < variousArray.length; i++) {
            int j = i;

            while (j > 0 && variousArray[j] < variousArray[j - 1]) {
                holder = variousArray[j - 1];
                variousArray[j - 1] = variousArray[j];
                variousArray[j] = holder;
                j--;
            }
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        timeInSeconds = (double) elapsedTime / seconds;
        return timeInSeconds;
    }

    public double selectionSort(int[] variousArray) {
        int holder;

        startTime = System.nanoTime();

        for (int i = 0; i < variousArray.length - 1; i++) {

            int smallest = i;

            for (int j = i + 1; j < variousArray.length; j++) {

                if (variousArray[j] < variousArray[smallest]) {
                    smallest = j;
                }
            }

            if (smallest != i) {
                holder = variousArray[i];
                variousArray[i] = variousArray[smallest];
                variousArray[smallest] = holder;
            }
        }

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        timeInSeconds = (double) elapsedTime / seconds;
        return timeInSeconds;
    }

    private int partition(int[] x, int lowerBound, int upperBound) {
        int temp;
        int pivot = x[upperBound];
        int i = lowerBound;
        int j = i;

        while (j <= upperBound) {
            if (j == upperBound) {
                temp = x[i];
                x[i] = pivot;
                x[upperBound] = temp;
                break;
            } else if (x[j] <= pivot) {
                if (j == i) {
                    if (j == upperBound && i == upperBound) {
                        break;
                    }
                    i++;
                    j++;
                } else if (j > i) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                    i++;
                    j++;
                }
            } else if (x[j] > pivot) {
                j++;
            }
        }
        return i;
    }

    public double quickSort(int[] variousArray, int low, int high) {
        startTime = System.nanoTime();

        if (low < high) {
            int midpoint = partition(variousArray, low, high);
            quickSort(variousArray, low, midpoint - 1);
            quickSort(variousArray, midpoint + 1, high);
        }

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        timeInSeconds = (double) elapsedTime / seconds;
        return timeInSeconds;
    }

    private void merge(int arr[], int lower, int middle, int higher) {
        int leftBound = middle - lower + 1;
        int rightBound = higher - middle;

        int left[] = new int[leftBound];
        int right[] = new int[rightBound];
        int iterator = 0;

        for (int i = lower; i <= middle; i++) {
            left[iterator] = arr[i];
            iterator++;
        }

        iterator = 0;

        for (int j = middle + 1; j <= higher; j++) {
            right[iterator] = arr[j];
            iterator++;
        }

        int i = 0;
        int j = 0;
        iterator = lower;

        while (i < leftBound && j < rightBound) {
            if (left[i] <= right[j]) {
                arr[iterator] = left[i];
                i++;
            } else {
                arr[iterator] = right[j];
                j++;
            }
            iterator++;
        }

        while (i < leftBound) {
            arr[iterator++] = left[i++];
        }

        while (j < rightBound) {
            arr[iterator++] = right[j++];
        }
    }

    public double mergeSort(int[] variousArray, int low, int high) {
        startTime = System.nanoTime();
        int midpoint;

        if (low < high) {
            midpoint = (low + high) / 2;
            mergeSort(variousArray, low, midpoint);
            mergeSort(variousArray, midpoint + 1, high);
            merge(variousArray, low, midpoint, high);
        }

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        timeInSeconds = (double) elapsedTime / seconds;
        return timeInSeconds;
    }

}