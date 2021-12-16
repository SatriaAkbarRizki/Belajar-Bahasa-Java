package bin.ganjilGenap;
import java.util.Scanner;

public class ganjil_genap
{
    public void GanjilGenap_Package()
    {
        Scanner input = new Scanner (System.in);
        int nilai;
        System.out.println ("Fitur Ganjil Genap");
        System.out.print ("Masukkan nilai nya: ");
        nilai = input.nextInt();
        for (int i = 1;i <=1000;i++)
        {
            if (i == nilai)
            {
                for (int a = 1; a <= 1000;a +=2)
                {
                    if (a == nilai)
                    {
                        System.out.println ("Nilai Anda: " + nilai);
                        System.out.println (nilai + " Adalah bilangan ganjil");
                    }
                }
    
                for (int b = 2;b <= 1000;b +=2)
                {
                    if (b == nilai)
                    {   
    
                        System.out.println ("Nilai Anda: " + nilai);
                        System.out.println (nilai + " Adalah bilangan genap");
                    }
                }
            }

        }
    }
    public static void main(String[] args) {
        ganjil_genap obj = new ganjil_genap();
        obj.GanjilGenap_Package();
    }
}