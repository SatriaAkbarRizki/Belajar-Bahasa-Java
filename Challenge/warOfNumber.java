package bin;
import java.util.ArrayList;
class warOfNumber
{
    public static void main(String[] args) {
        int[] sum1 = {2, 8, 7, 5};
        int[] sum2 = {12, 90, 75};
        int[] sum3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        warOfNumbers(sum1);
        warOfNumbers(sum2);
        warOfNumbers(sum3);
    }
    
    static int warOfNumbers (int[] numbers)
    {
        int sumOdd = 0, sumEven  = 0;
        int value = 0;
        ArrayList <Integer> numberOdd = new ArrayList<Integer>();
        ArrayList <Integer> numberEven = new ArrayList<Integer>();

        for (Integer i = 0; i < numbers.length;i++)
        {

            if (numbers[i]%2!= 0)
            {
                numberOdd.add (numbers[i]);
            }
            else if (numbers[i]%2==0)
            {
                numberEven.add (numbers[i]);
            }
        }

        for (int a = 0; a < numberOdd.size();a++)
        {
            if (numberOdd.size() > 0)
            {
                sumOdd = sumOdd + numberOdd.get(a);
            }
        }

        for (int b = 0; b < numberEven.size();b++)
        {
            if (numberEven.size() > 0)
            {
                sumEven = sumEven + numberEven.get(b);
            }
        }

        if ( sumEven > sumOdd)
        {
            value = sumEven - sumOdd;
        }
        else
        {
            value = sumOdd -sumEven;
        }

        System.out.printf("%d\n",value);
        return value;
    }
}