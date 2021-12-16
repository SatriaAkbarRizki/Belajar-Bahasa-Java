package bin.swapVariabel;
import java.util.Scanner;

public class swap_Var
{
    public void swap_Package()
    {
        Scanner input = new Scanner (System.in);
        int angka1, angka2;
        int temp;
        System.out.println("Fitur Swap Nomor");
        System.out.print ("Masukkan angka ke 1: ");
        angka1 = input.nextInt();

        System.out.print ("Masukkan angka ke 2: ");
        angka2 = input.nextInt();
        temp = angka1;
        angka1 = angka2;
        angka2 = temp;
        System.out.println ("Angka 1: " + angka1);
        System.out.println ("Angka 2: " + angka2 );
    }
    public static void main(String[] args) 
    {
        swap_Var obj = new swap_Var();
        obj.swap_Package();
    }
}