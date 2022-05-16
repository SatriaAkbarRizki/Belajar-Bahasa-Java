package bin;
import java.util.stream.IntStream;
public class sumTrue {
    public static int countTrue(boolean[] arr) {
        int countBoolean = 0;
        for (int  i = 0 ; i < arr.length;i++)
        {
            if (arr[i])
            {
                countBoolean++;
            }
            if (countBoolean < 0)
            {
                break;
            }
        }
        
        System.out.printf("Length in Array Boolean: %d\n",countBoolean);
        return countBoolean;
	}

        public static void main(String[] args) {
        boolean[] array1 = {true, false, false, true, false};
        boolean[] array2 = {false, false, false, false};
        boolean[] array3 = {};
        countTrue(array1);
        countTrue(array2);
        countTrue(array3);
    }

}

