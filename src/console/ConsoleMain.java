package console;

import common.LargestSubsequenceSum;
import java.util.Scanner;

public class ConsoleMain {

    public static void main(String[] args) {
        int size = readValues("Size:");
        int[] array = fillArray(size);
        int receivedSum = LargestSubsequenceSum.calcMaxSequenceSum(array);
        printResult(array, receivedSum);
    }

    private static int readValues(String name) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Array characteristics:\n %s ", name);
        return scan.nextInt();
    }

    private static int[] fillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = readValues("Value in array: ");
        }
        return array;
    }

    private static void printResult(int[] array, int receivedSum) {
        System.out.printf("Maximum sum of consecutive elements: %s ", LargestSubsequenceSum.calcMaxSequenceSum(array));
    }
}
    
