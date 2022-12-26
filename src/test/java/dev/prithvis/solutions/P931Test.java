package dev.prithvis.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P931Test {
    P931 solution = new P931();

    @Test
    public void test1() {
        int[][] input = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };
        assertEquals(13, solution.minFallingPathSum(input));
    }

    @Test
    public void test2() {
        int[][] input = {
                {-19, 57},
                {-40, -5},
        };
        assertEquals(-59, solution.minFallingPathSum(input));
    }
}