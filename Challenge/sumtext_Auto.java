package bin;
public class sumtext_Auto {
    public static void main(String[] args) {
        countWords("Just an example here move along");
        countWords("This is a test");
        countWords("What an easy task, right");

    }
    public static int countWords(String s)
    {
        String[] text = s.trim().split("\\s+");  
        int wordcount = text.length;
        System.out.printf ("\n%d",wordcount);
        return wordcount;
    }
    // Trim() menghapus spasi awal dan akhir
    // split() berguna untuk memisahkan kumpulan text
}
