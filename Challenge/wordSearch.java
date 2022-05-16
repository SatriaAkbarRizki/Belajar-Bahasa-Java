package bin;

import java.util.Arrays;
import java.util.stream.IntStream;

class wordSearch
{
    public static void main(String[] args) {
    char[][] textD= 
    {
        {'D', 'E', 'Y', 'H', 'A', 'D'},
        {'C', 'B', 'Z', 'Y', 'J', 'K'},
        {'D', 'B', 'C', 'A', 'M', 'N'},
        {'F', 'G', 'G', 'R', 'S', 'R'},
        {'V', 'X', 'H', 'A', 'S', 'S'}
    };

    char[][] textH = 
    {
        {'D', 'E', 'Y', 'H', 'A', 'D'},
        {'C', 'B', 'Z', 'Y', 'J', 'K'},
        {'D', 'B', 'C', 'A', 'M', 'N'},
        {'F', 'G', 'G', 'R', 'S', 'R'},
        {'V', 'X', 'H', 'A', 'S', 'S'}
    };

    letterCounter(textD, 'D');
    letterCounter(textH, 'H');
    };

    static int letterCounter (char[][] arr, char c)
    {
        int letterCount = 1;
        for (char[] column : arr)
        {
            for(char row : column)
            {
                if (row == c)
                {
                    System.out.println(letterCount++); 
                }
            }
        }
        return letterCount;
    }
}