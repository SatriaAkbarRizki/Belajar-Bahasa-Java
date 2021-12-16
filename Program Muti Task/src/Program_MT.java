package bin.Program_MT;
import java.util.Scanner;
import bin.ganjilGenap.*;
import bin.swapVariabel.*;
import bin.Auto_bilTerbesar.*;
import bin.Changelog.*;
import bin.Pembagi_Bil.*;

public class Program_MT
{
    public static void main(String[] args) 
    {
        System.out.print ("\033\143");
        Scanner input = new Scanner (System.in);
        int pilihan;
        ganjil_genap obj1 = new ganjil_genap();
        swap_Var obj2 =new swap_Var();
        Auto_BilTerbesar obj3 = new Auto_BilTerbesar();
        Changelog obj4 = new Changelog();
        Pembagi_bilangan obj5 = new Pembagi_bilangan();

        //Changelog obj1 = new Changelog();
        System.out.print ("SELAMAT DATANG DI PROGRAM MULTI FUNGSI (STABLE)\n");

        System.out.println ("Menu Program");
        System.out.println ("1. Ganiil Genap");
        System.out.println ("2. Swap Nomor");
        System.out.println ("3. Bilangan Terbesar");
        System.out.println ("4. Nilai Bagi Habis");
        System.out.println ("5. Changelog");
        System.out.print ("Nomor Program: ");
        pilihan = input.nextInt();
        if (pilihan == 1)
        {
            System.out.print ("\033\143");
            obj1.GanjilGenap_Package();
        }
        else if (pilihan == 2)
        {
            System.out.print ("\033\143");
            obj2.swap_Package();
        }
        else if (pilihan == 3)
        {
            System.out.print ("\033\143");
            obj3.bilTerbesar_Package();
        }
        else if (pilihan == 4)
        {
            System.out.print ("\033\143");
            obj5.PembagiBilangan_Package();

        }
        else if (pilihan == 5)
        {
            System.out.print ("\033\143");
            obj4.Changelog_Package();
        }
        else if (pilihan > 5)
        {
            System.out.println ("Maaf Nomor anda salah atau Program tersebut belum Ada");
        } 
    }
}