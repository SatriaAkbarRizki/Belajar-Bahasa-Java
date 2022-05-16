package bin;
public class triagularNum {
    public static void main(String[] args) {
        triangle(1); // hasil 1
        triangle(6);  // hasil 21
        triangle(215); // hasil 23220
    }
    public static int triangle(int n)
    {
        int sum = 0;
        for (int i  = 0; i < n;i++)
        {
            sum = sum + i;
            sum++;
        }
        System.out.println(sum);
        return sum;
    }
}
