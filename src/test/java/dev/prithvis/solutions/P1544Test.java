package dev.prithvis.solutions;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class P1544Test {
    private String input;
    private String output;
    private P1544 solution;
    @Before
    public void initialize(){
        solution=new P1544();
    }
    public P1544Test(String input,String output){
        this.input=input;
        this.output=output;
    }
    @Parameterized.Parameters
    public static Collection inputStrings(){
        return Arrays.asList(new Object[][]{
                {"leEeetcode","leetcode"},
                {"abBAcC",""},
                {"s","s"}
        });
    }
    @Test(timeout = 1000)
    public void testMakeGood(){
        assertEquals(output,solution.makeGood(input));
    }
}