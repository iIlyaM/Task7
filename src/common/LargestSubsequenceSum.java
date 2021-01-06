package common;

public class LargestSubsequenceSum {
    public static int calcMaxSequenceSum(int[] array) {
        int maxSum;
        if (array.length < 2) {
            maxSum = array[0];
        } else {
            int currSum = array[1] + array[0];
            maxSum = array[1] + array[0];
            int currDiff;
            int prevDiff = array[1] - array[0];

            for (int i = 2; i < array.length; i++) {
                currDiff = array[i] - array[i - 1];
                if (currDiff == prevDiff) {
                    currSum += array[i];
                } else {
                    currSum = array[i] + array[i - 1];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                prevDiff = currDiff;
            }
        }
        return maxSum;
    }
}
