package bin;
public class stringCheck {
    public static void main(String[] args) {
        checkEnding("abc", "bc");
        checkEnding("abc", "d");
        checkEnding("samurai", "zi");
        checkEnding("feminine", "nine");
        checkEnding("convention", "tio");
    }
    public static boolean checkEnding(String str1, String str2)
    {
        Boolean checK1 = true;
        Boolean checK2 = false;
        if (str1.endsWith(str2))
        {
            System.out.println (checK1);
            return checK1;
        }
        else
        {
            System.out.println(checK2);
            return checK2;
        }
        
    }
}
/*
    endwith() berguna untuk menampilkan huruf tertentu >> Contoh diatas udh auto kalau manual bisa
    pakai substring (int beginIndex, int endIndex) cari aja di gugel di web begginerBook
*/
