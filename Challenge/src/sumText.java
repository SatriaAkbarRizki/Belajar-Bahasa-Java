package bin;
import java.util.Scanner;
import java.util.stream.IntStream;

class sumText
{
    static String converteToChar(String convText)
    {
        char[] c = convText.toCharArray();
        int sum= c.length;
        System.out.printf("\nSum in text: %d",sum);
        return convText;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a,b,c;
        System.out.print("Input Character: ");
        a = input.nextLine();

        System.out.print("Input Character: ");
        b = input.nextLine();

        System.out.print("Input Character: ");
        c = input.nextLine();

        converteToChar(a);
        converteToChar(b);
        converteToChar(c);

    }


}