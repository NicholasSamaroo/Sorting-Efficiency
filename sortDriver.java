import sortingEfficiency.*;
import java.util.Scanner;

public class sortDriver {
        public static void main(String[] args) {
                int[] test;
                double time;
                final int SMALL = 100;
                final int MEDIUM = 1000;
                final int LARGE = 10000;
                sorts y = new sorts();
                variousArrays x = new variousArrays();

                System.out.println(
                                "I will be testing the efficiency of Merge Sort sort, Quick sort, Insertion sort, and Selection sort on various array sizes and types\n");
                System.out.println("Please enter the number for the sort you want to test:");
                System.out.println(
                                "\n 1 - Merge Sort \n 2 - Quick Sort \n 3 - Insertion Sort \n 4 - Selection Sort \n");

                Scanner scanner = new Scanner(System.in);
                String sortSelection = scanner.nextLine();
                scanner.close();
                System.out.println();

                switch (sortSelection) {
                        case "1":
                                // MERGE SORT
                                test = x.randomArray(SMALL);
                                time = y.mergeSort(test, 0, SMALL - 1);
                                System.out.println("Elapsed time for Merge sort on a random array of size " + SMALL
                                                + " is " + time);
                                test = x.randomArray(MEDIUM);
                                time = y.mergeSort(test, 0, MEDIUM - 1);
                                System.out.println("Elapsed time for Merge sort on a random array of size " + MEDIUM
                                                + " is " + time);
                                test = x.randomArray(LARGE);
                                time = y.mergeSort(test, 0, LARGE - 1);
                                System.out.println("Elapsed time for Merge sort on a random array of size " + LARGE
                                                + " is " + time);
                                System.out.println();
                                /******************************************************/
                                /******************************************************/
                                test = x.ascendingArray(SMALL);
                                time = y.mergeSort(test, 0, SMALL - 1);
                                System.out.println("Elapsed time for Merge sort on an ascending array of size " + SMALL
                                                + " is " + time);
                                test = x.ascendingArray(MEDIUM);
                                time = y.mergeSort(test, 0, MEDIUM - 1);
                                System.out.println("Elapsed time for Merge sort on an ascending array of size " + MEDIUM
                                                + " is " + time);
                                test = x.ascendingArray(LARGE);
                                time = y.mergeSort(test, 0, LARGE - 1);
                                System.out.println("Elapsed time for Merge sort on an ascending array of size " + LARGE
                                                + " is " + time);
                                System.out.println();
                                /******************************************************/
                                /******************************************************/
                                test = x.descendingArray(SMALL);
                                time = y.mergeSort(test, 0, SMALL - 1);
                                System.out.println("Elapsed time for Merge sort on a descending array of size " + SMALL
                                                + " is " + time);
                                test = x.descendingArray(MEDIUM);
                                time = y.mergeSort(test, 0, MEDIUM - 1);
                                System.out.println("Elapsed time for Merge sort on a descending array of size " + MEDIUM
                                                + " is " + time);
                                test = x.descendingArray(LARGE);
                                time = y.mergeSort(test, 0, LARGE - 1);
                                System.out.println("Elapsed time for Merge sort on a descending array of size " + LARGE
                                                + " is " + time);
                                break;
                        case "2":
                                // QUICK SORT
                                test = x.randomArray(SMALL);
                                time = y.quickSort(test, 0, SMALL - 1);
                                System.out.println("Elapsed time for Quick sort on a random array of size " + SMALL
                                                + " is " + time);
                                test = x.randomArray(MEDIUM);
                                time = y.quickSort(test, 0, MEDIUM - 1);
                                System.out.println("Elapsed time for Quick sort on a random array of size " + MEDIUM
                                                + " is " + time);
                                test = x.randomArray(LARGE);
                                time = y.quickSort(test, 0, LARGE - 1);
                                System.out.println("Elapsed time for Quick sort on a random array of size " + LARGE
                                                + " is " + time);
                                System.out.println();
                                /******************************************************/
                                /******************************************************/
                                test = x.ascendingArray(SMALL);
                                time = y.quickSort(test, 0, SMALL - 1);
                                System.out.println("Elapsed time for Quick sort on an ascending array of size " + SMALL
                                                + " is " + time);
                                test = x.ascendingArray(MEDIUM);
                                time = y.quickSort(test, 0, MEDIUM - 1);
                                System.out.println("Elapsed time for Quick sort on an ascending array of size " + MEDIUM
                                                + " is " + time);
                                test = x.ascendingArray(LARGE);
                                time = y.quickSort(test, 0, LARGE - 1);
                                System.out.println("Elapsed time for Quick sort on an ascending array of size " + LARGE
                                                + " is " + time);
                                System.out.println();
                                /******************************************************/
                                /******************************************************/
                                test = x.descendingArray(SMALL);
                                time = y.quickSort(test, 0, SMALL - 1);
                                System.out.println("Elapsed time for Quick sort on an descending array of size " + SMALL
                                                + " is " + time);
                                test = x.descendingArray(MEDIUM);
                                time = y.quickSort(test, 0, MEDIUM - 1);
                                System.out.println("Elapsed time for Quick sort on an descending array of size "
                                                + MEDIUM + " is " + time);
                                test = x.descendingArray(LARGE);
                                time = y.quickSort(test, 0, LARGE - 1);
                                System.out.println("Elapsed time for Quick sort on an descending array of size " + LARGE
                                                + " is " + time);
                                break;
                        case "3":
                                // INSERTION SORT
                                test = x.randomArray(SMALL);
                                time = y.insertionSort(test);
                                System.out.println("Elapsed time for Insertion sort on a random array of size " + SMALL
                                                + " is " + time);
                                test = x.randomArray(MEDIUM);
                                time = y.insertionSort(test);
                                System.out.println("Elapsed time for Insertion sort on a random array of size " + MEDIUM
                                                + " is " + time);
                                test = x.randomArray(LARGE);
                                time = y.insertionSort(test);
                                System.out.println("Elapsed time for Insertion sort on a random array of size " + LARGE
                                                + " is " + time);
                                System.out.println();
                                /******************************************************/
                                /******************************************************/
                                test = x.ascendingArray(SMALL);
                                time = y.insertionSort(test);
                                System.out.println("Elapsed time for Insertion sort on a ascending array of size "
                                                + SMALL + " is " + time);
                                test = x.ascendingArray(MEDIUM);
                                time = y.insertionSort(test);
                                System.out.println("Elapsed time for Insertion sort on a ascending array of size "
                                                + MEDIUM + " is " + time);
                                test = x.ascendingArray(LARGE);
                                time = y.insertionSort(test);
                                System.out.println("Elapsed time for Insertion sort on a ascending array of size "
                                                + LARGE + " is " + time);
                                System.out.println();
                                /******************************************************/
                                /******************************************************/
                                test = x.descendingArray(SMALL);
                                time = y.insertionSort(test);
                                System.out.println("Elapsed time for Insertion sort on a descending array of size "
                                                + SMALL + " is " + time);
                                test = x.descendingArray(MEDIUM);
                                time = y.insertionSort(test);
                                System.out.println("Elapsed time for Insertion sort on a descending array of size "
                                                + MEDIUM + " is " + time);
                                test = x.descendingArray(LARGE);
                                time = y.insertionSort(test);
                                System.out.println("Elapsed time for Insertion sort on a descending array of size "
                                                + LARGE + " is " + time);
                                System.out.println();
                                break;
                        case "4":
                                // SELECTION SORT
                                test = x.randomArray(SMALL);
                                time = y.selectionSort(test);
                                System.out.println("Elapsed time for Selection sort on a random array of size " + SMALL
                                                + " is " + time);
                                test = x.randomArray(MEDIUM);
                                time = y.selectionSort(test);
                                System.out.println("Elapsed time for Selection sort on a random array of size " + MEDIUM
                                                + " is " + time);
                                test = x.randomArray(LARGE);
                                time = y.selectionSort(test);
                                System.out.println("Elapsed time for Selection sort on a random array of size " + LARGE
                                                + " is " + time);
                                System.out.println();
                                /******************************************************/
                                /******************************************************/
                                test = x.ascendingArray(SMALL);
                                time = y.selectionSort(test);
                                System.out.println("Elapsed time for Selection sort on a ascending array of size "
                                                + SMALL + " is " + time);
                                test = x.ascendingArray(MEDIUM);
                                time = y.selectionSort(test);
                                System.out.println("Elapsed time for Selection sort on a ascending array of size "
                                                + MEDIUM + " is " + time);
                                test = x.ascendingArray(LARGE);
                                time = y.selectionSort(test);
                                System.out.println("Elapsed time for Selection sort on a ascending array of size "
                                                + LARGE + " is " + time);
                                System.out.println();
                                /******************************************************/
                                /******************************************************/
                                test = x.descendingArray(SMALL);
                                time = y.selectionSort(test);
                                System.out.println("Elapsed time for Selection sort on a descending array of size "
                                                + SMALL + " is " + time);
                                test = x.descendingArray(MEDIUM);
                                time = y.selectionSort(test);
                                System.out.println("Elapsed time for Selection sort on a descending array of size "
                                                + MEDIUM + " is " + time);
                                test = x.descendingArray(LARGE);
                                time = y.selectionSort(test);
                                System.out.println("Elapsed time for Selection sort on a descending array of size "
                                                + LARGE + " is " + time);
                                break;
                        default:
                                System.out.println(
                                                "You have entered an invalid number, please run the program again with a valid number");
                                break;
                }

        }
}