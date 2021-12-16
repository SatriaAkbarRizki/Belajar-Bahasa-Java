package bin.Auto_bilTerbesar;
import java.util.Scanner;
public class Auto_BilTerbesar
{
    public void bilTerbesar_Package()
    {
        Scanner input = new Scanner (System.in);
        int nilai_1, nilai_2, nilai_3;
        System.out.println("Fitur Bilangan Terbesar");
        System.out.print ("Masukkan nilai Pertama: ");
        nilai_1 = input.nextInt();

        System.out.print ("Masukkan nilai Kedua: ");
        nilai_2 = input.nextInt();

        System.out.print ("Masukkan nilai Ketiga: ");
        nilai_3 = input.nextInt();

        System.out.println ("\nNilai: "+ nilai_1 + " "+ nilai_2 + " " + nilai_3);
        if (nilai_1 > nilai_2 && nilai_1 > nilai_3)
        {
            System.out.println ("Nilai paling besar: " + nilai_1);
        }
        else if (nilai_2 > nilai_1 && nilai_2 > nilai_3)
        {
            System.out.println ("Nilai paling besar: " + nilai_2);
        }
        else if(nilai_3 > nilai_1 && nilai_3 > nilai_2)
        {
            System.out.println ("Nilai paling besar: " + nilai_3);
        }
    }
    public static void main(String[] args) {
        Auto_BilTerbesar obj = new Auto_BilTerbesar();
        obj.bilTerbesar_Package();
    }
}