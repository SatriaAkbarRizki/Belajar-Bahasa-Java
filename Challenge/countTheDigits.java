package bin;
public class countTheDigits {

    public static void main(String[] args) {
        System.out.println(digitsCount(1234));
        System.out.println(digitsCount(544));
        System.out.println(digitsCount(1234));
        System.out.println(digitsCount(121317));
        System.out.println(digitsCount(1));
        System.out.println(digitsCount(12345));
        System.out.println(digitsCount(1289396387328L));
    }
    static int digitsCount (long n)
    {
        if (n == 0)
        {
            return 0;
        }
        else
        {
            return  1 + digitsCount(n / 10);
        }
    }
}