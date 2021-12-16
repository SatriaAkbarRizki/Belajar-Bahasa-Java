package bin.Pembagi_Bil;
import java.util.Scanner;
public class Pembagi_bilangan
{
    public void PembagiBilangan_Package()
    {
        Scanner input = new Scanner (System.in);
        int bilangan, nilaiFaktor = 0;
        System.out.println("Fittur Nilai Bagi Habis");
        System.out.print ("Masukkan nilai nya: ");
        bilangan = input.nextInt();

            for (int i = 1;i <= 100;i++)
            {
                if (bilangan % i == 0)
                {
                    System.out.println ("Faktor dari " + bilangan + " adalah: " + i);
                }
            }
            
    }
    public static void main(String[] args) 
    {
        Pembagi_bilangan obj = new Pembagi_bilangan();
        obj.PembagiBilangan_Package();
    }
}