package bin;

import java.util.stream.IntStream;

class arrayRecursive
{
    public static void main(String[] args) {
        int sum1 [] = {1, 2, 3, 4};
        int sum2 [] = {1,2};
        int sum3 [] = {1};
        int sum4 [] = {};
        sum(sum1);
        sum(sum2);
        sum(sum3);
        sum(sum4);
    }

    static int sum (int[] arr)
    {
        int number = 0;
        if (arr.length > 0)
        {
            for (int i = 0; i < arr.length;i++)
            {
                number = number + arr[i] + 1;
            }
            return sum(number -1);
        }
        else
        {
            
            return arr[0]
        }
    }
}