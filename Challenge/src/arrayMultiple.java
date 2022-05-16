package bin;
import java.util.Arrays;
public class arrayMultiple
{
    public static void main(String[] args) {
        arrayOfMultiples(7, 5);
        arrayOfMultiples(12, 10);
        arrayOfMultiples(17, 6);
    }
    static int [] arrayOfMultiples (int num, int length )
    {
        int[] numArray = new int [num];
        int [] lengthArray = new int [length];

        for (int i = 0;i <= lengthArray.length;i++)
        {
            numArray[i] = num * i;
        }
        for (int a = 1;a <= lengthArray.length;a++)
        {
            System.out.printf ("%d\n", numArray[a]);
        }

        return numArray;

    }
}