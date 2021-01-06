package test;

import common.LargestSubsequenceSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestSubsequenceSumTest {

    @Test
    public void test1() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{9, 9, 0, 1, 2, 3});
        int expectedResult = 18;
        assertEquals(array, expectedResult);
    }

    @Test
    public void test2() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{-24, -26, -28, -65, -64, -63, -68});
        int expectedResult = -50;
        assertEquals(array, expectedResult);
    }

    @Test
    public void test3() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{1, 2, 6, 4, 7, 8, 9, 10, 11});
        int expectedResult = 45;
        assertEquals(array, expectedResult);
    }

    @Test
    public void test4() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{-14, -11, -8, -5, -6, -10, -14});
        int expectedResult = -11;
        assertEquals(array, expectedResult);
    }

    @Test
    public void test5() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{3});
        int expectedResult = 3;
        assertEquals(array, expectedResult);
    }

    @Test
    public void test6() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{3, 5, 7, 9, 8, 6, 4, 10, 16});
        int expectedResult = 30;
        assertEquals(array, expectedResult);
    }

    @Test
    public void test7() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{-135, -130, -125, -120, -91, -121, -151});
        int expectedResult = -211;
        assertEquals(array, expectedResult);
    }

    @Test
    public void test8() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{-22, -24, -26, -28, -135, -136, -65, -64});
        int expectedResult = -46;
        assertEquals(array, expectedResult);
    }

    @Test
    public void test9() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{65, 68, 71, 74, 28, 48, 17, 15, 13, 63, 70, 77});
        int expectedResult = 278;
        assertEquals(array, expectedResult);
    }

    @Test
    public void test10() {
        int array = LargestSubsequenceSum.calcMaxSequenceSum(new int[]{46, 49, 52, 50, 58, 61, 64, 60, 56});
        int expected = 183;
        assertEquals(array, expected);
    }
}
