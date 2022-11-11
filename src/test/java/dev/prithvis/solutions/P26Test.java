package dev.prithvis.solutions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class P26Test {
    private static final Random random = new SecureRandom(); // java preferred way of generating random numbers
    private final P26 solution = new P26();

    @Test(timeout = 10)
    public void whenInputArrayIsEmpty() {
        assertEquals(0, solution.removeDuplicates(new int[]{}));
    }

    @Test(timeout = 1000)
    public void whenInputArrayContainsSameElements() {
        int[] nums = new int[random.nextInt(5, 10)]; // generates a random array of size between 5 and 10
        Arrays.fill(nums, random.nextInt(10));
        assertEquals(1, solution.removeDuplicates(nums));
    }

    @Test(timeout = 1000)
    public void whenAllInputArrayElementsAreDistinct() {
        int[] nums = random.ints(1, 100).
                distinct().
                limit(50).
                sorted().
                toArray(); // generating a random array of 50 elements in increasing order
        assertEquals(50, solution.removeDuplicates(nums));
    }

    @Test(timeout = 100)
    public void whenInputArrayContainsDuplicateValues1() {
        int[] nums = new int[]{1, 1, 2};
        assertEquals(2, solution.removeDuplicates(nums));
    }

    @Test(timeout = 100)
    public void whenInputArrayContainsDuplicateValues2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, solution.removeDuplicates(nums));
    }

}