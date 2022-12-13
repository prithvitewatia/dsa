package dev.prithvis.solutions;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class P931Test {
    P931 solution;
    @Before
    public void beforeMethod(){
        solution=new P931();
    }
    @Test
    public void test1(){
        int[][] input={
                {2,1,3},
                {6,5,4},
                {7,8,9}
        };
        assertEquals(13,solution.minFallingPathSum(input));
    }
    @Test
    public void test2(){
        int[][] input={
                {-19,57},
                {-40,-5},
        };
        assertEquals(-59,solution.minFallingPathSum(input));
    }

    private int[][] generateRandom2dArray(int length,int breadth,int minValue,int maxValue){
        assert length >=0 && breadth >=0;
        int[][] randomArray=new int[length][breadth];
        Random random=new Random();
        for(int i=0;i<length;i++){
            for(int j=0;j<breadth;j++){
                randomArray[i][j]= random.nextInt(minValue,maxValue);
            }
        }
        System.out.println(Arrays.deepToString(randomArray));
        return randomArray;
    }
}