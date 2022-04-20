package bin;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class numberHigher {
    
    public static void main(String[] args) {
        int [] number1 = {5, 3, 15, 22, 4};
        int [] number2= {1, 2, 3, 4, 5};
        int [] number3 = { 4, 3, 3, 3, 2, 2, 2};
        int [] number4 = {};
        existsHigher(number1,10);
        existsHigher(number2,8);
        existsHigher(number3,4);
        existsHigher(number4,5);

    }
    public static boolean existsHigher(int[] arr, int n)
    {
        boolean back = true;
        boolean check1 = true;
        boolean check2 = false;

        Arrays.sort(arr);
        if (arr.length == 0 )  // cek element array ada apa tidak?
        {
            System.out.printf ("%b\n", check2);
        }
        else
        {
            int lastnum = arr[arr.length-1];
            if (lastnum >= n)
            {
                System.out.printf("%b\n",check1);
                return check1;
            }
            else{
                System.out.printf ("%b\n",check2);
            }
        }
        return check2;
    }

}
