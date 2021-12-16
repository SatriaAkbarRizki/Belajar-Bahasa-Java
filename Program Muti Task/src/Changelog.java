package bin.Changelog;
import java.util.ArrayList;
public class Changelog
{
    public void Changelog_Package() // ini class
    {
        ArrayList <String> nomor = new ArrayList <String> ();
        {
            nomor.add (" ");
            nomor.add ( "Initial Build Lupa Catat Tanggalnya :)");
            nomor.add ( "Perbaiki Bug Lupa Catat Tanggalnya :)");
            nomor.add ( "Penambahan Program Deteksi nilai Besar [23/10/2021]");
            nomor.add ( "Perbaiki kesalahn kata [29/10/2021]");
            nomor.add ( "import Fitur Ganjil Genap ke Program_MT dengan Package [BETA] [29/10/2021]");
            nomor.add ( "import Fitur Swap angka ke Program_MT dengan Package [BETA] [29/10/2021]");
            nomor.add ( "import Fitur bil_terbesar ke Program_MT dengan Package [BETA] [29/10/2021]");
            nomor.add ( "Perbagi Bug [6/11/2021]");
            nomor.add ( "Fitur Bagi habis [Canary] [Coming Soon] [6/11/2021]");
            nomor.add ( "Fitur Ganjil Genap ke Program_MT dengan Package [STABLE] [6/11/2021]");
            nomor.add ( "Fitur Swap angka ke Program_MT dengan Package [STABLE] [6/11/2021]");
            nomor.add ( "Fitur bil_terbesar ke Program_MT dengan Package [STABLE] [6/11/2021]");
            nomor.add ( "Penambahan Fitur Habis Bagi [STABLE] [28/11/2021]");
            nomor.add ( "Penambahan nama fitur disaat user memilih fitur [16/12/2021]");
        }
        for (Integer i = 1; i < nomor.size();i++)
        {
            System.out.println (i + ". " + nomor.get(i));
        }
            //System.out.println (nomor.get(5) + ",")

    }
    public static void main(String[] args) 
    {
        Changelog obj = new Changelog();  // membuat objek
        obj.Changelog_Package(); // memanggil method
    }
}