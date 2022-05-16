package bin;
class minutesstoSeconds
{
    public static void main(String[] args) {
        convert(5);
        convert(3);
        convert(2);
    }

    static int convert (int minutes)
    {
        int sum = 0;
        int second = 60;
        for (int i = 0; i < minutes;i++)
        {
            sum += second;
        }
        System.out.printf ("%d\n", sum);
        return sum;
    }
}