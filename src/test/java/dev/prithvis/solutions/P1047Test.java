package dev.prithvis.solutions;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class P1047Test {

    private String input;
    private String output;
    private P1047 solution;

    public P1047Test(String input,String output){
        this.input=input;
        this.output=output;
    }

    @Before
    public void initialize(){
        solution=new P1047();
    }

    @Parameterized.Parameters
    public static Collection inputStrings(){
        return Arrays.asList(new Object[][]{
                {"abbaca","ca"},
                {"azxxzy","ay"},
                {"s","s"}
        });
    }

    @Test(timeout = 100)
    public void removeDuplicates() {
        assertEquals(output,solution.removeDuplicates(input));
    }
}