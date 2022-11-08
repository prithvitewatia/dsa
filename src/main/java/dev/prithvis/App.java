package dev.prithvis;

import dev.prithvis.solutions.P1544;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final System.Logger LOGGER=System.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        // Tests your solutions manually here
        String input="leEeetcode";
        P1544 solution=new P1544();
        LOGGER.log(System.Logger.Level.INFO,solution.makeGood(input));
    }
}
