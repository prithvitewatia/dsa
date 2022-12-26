package dev.prithvis.solutions;

import java.util.Arrays;

public class P931 {
    private long[][] fallingSums;
    private long minimiseSum(int depth, int width, int[][] matrix) {
        // checking for out of bounds value
        if (width < 0 || width >= matrix[0].length) {
            // returning maximum large value to prevent minimization on this path
            return Integer.MAX_VALUE;
        }
        else if(depth == matrix.length-1){
            fallingSums[depth][width]=matrix[depth][width];
            return matrix[depth][width];
        }
        if(fallingSums[depth][width]!=Integer.MAX_VALUE){
            return fallingSums[depth][width];
        }
        fallingSums[depth][width]=matrix[depth][width] + Math.min(
                minimiseSum(depth + 1, width, matrix),
                Math.min(minimiseSum(depth + 1, width - 1, matrix),
                        minimiseSum(depth + 1, width + 1, matrix)));
        return fallingSums[depth][width];
    }

    public int minFallingPathSum(int[][] matrix) {
        // getting maximum value for integer
        int maxValue=Integer.MAX_VALUE;
        // creating a 2d dp array to store minimum computed values
        // these values will later be reduced.
        fallingSums=new long[matrix.length][matrix[0].length];
        for(long[] arr:fallingSums){
            Arrays.fill(arr,maxValue);
        }
        // retrieving minimum found value
        long foundMin = maxValue;
        for (int i = 0; i < matrix.length; i++) {
            foundMin = Math.min(foundMin, minimiseSum(0,i,matrix));
        }
        return (int)foundMin;
    }
}
