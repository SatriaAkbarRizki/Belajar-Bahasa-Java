package bin;
import java.lang.StringBuilder;
class reverseString
{
    public static void main(String[] args) {
        reverse("Hello World");
        reverse("The quick brown fox.");
        reverse("Edabit is really helpful!");
    }

    static String reverse (final String str)
    {
        String reverseString = new StringBuilder(str).reverse().toString();
        //reverseString.reverse();
        System.out.println(reverseString);
        return reverseString;
    }
}