package bin;
import java.util.Arrays;

class ArrayFill
{
    public static void main(String[] args) {
        squarePatch(3);
        squarePatch(5);
        squarePatch(1);
        squarePatch(0);
    
    }

    public static int[][] squarePatch(int n)
    {
        int ar [][] = new int [n][n];

        for (int [] row : ar)
        
        Arrays.fill(row, n);
        
        System.out.println(Arrays.deepToString(ar));

        return ar;
    }
}