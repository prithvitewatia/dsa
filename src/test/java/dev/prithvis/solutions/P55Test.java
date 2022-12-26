package dev.prithvis.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P55Test {
    P55 solution = new P55();

    @Test
    public void test1() {
        int[] input = {2, 3, 1, 1, 4};
        boolean expectedOutput = true;
        boolean actualOutput = solution.canJump(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        int[] input = {3, 2, 1, 0, 4};
        boolean expectedOutput = false;
        boolean actualOutput = solution.canJump(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test3() {
        int[] input = {1, 2, 3};
        boolean expectedOutput = true;
        boolean actualOutput = solution.canJump(input);
        assertEquals(expectedOutput, actualOutput);
    }


}