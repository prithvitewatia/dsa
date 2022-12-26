package dev.prithvis.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1207Test {

    P1207 solution = new P1207();

    @Test
    public void whenAllCountAreUnique(){
        assertTrue(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    @Test
    public void whenCountIsNotUnique(){
        assertFalse(solution.uniqueOccurrences(new int[]{1,2}));
    }

    @Test
    public void testWithNegativeNumbers(){
        assertTrue(solution.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}