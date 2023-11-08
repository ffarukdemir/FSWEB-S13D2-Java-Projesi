public class Main {
    public static void main(String[] args) {

        System.out.println("isPalindrome(-1221): " + isPalindrome(-1221));
        System.out.println("isPalindrome(707): " + isPalindrome(707));
        System.out.println("isPalindrome(11212): " + isPalindrome(11212));
        System.out.println("isPerfectNumber(6): " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28): " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5): " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1): " + isPerfectNumber(-1));
        System.out.println(numberToWords(123));

    }


    public static boolean isPalindrome(int sayi) {

        String StrSayi = String.valueOf(Math.abs(sayi));

        for (int i = 0; i < StrSayi.length(); i++) {
            if (StrSayi.charAt(i) == StrSayi.charAt(StrSayi.length() - 1 - i)) {
                return true;
            }
            return false;
        }
        return false;

    }

    public static boolean isPerfectNumber(int sayi) {
        int toplamBolenler = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplamBolenler += i;
                if (toplamBolenler == sayi) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String numberToWords(int sayi) {

        // sayiyi  StrSayi stringe dönüştür
        String strSayi = String.valueOf(sayi);

        // StrSayi'yi char arrayine dönüştür.
        char[] charsStrSayi = strSayi.toCharArray();
        System.out.println(charsStrSayi);



        // rakamlar arrayi tanımla

        String[] rakamlar = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};

        // sonuc stringi oluştur.
        String sonuc = "";


        // loop yap

        for (char charStrSayi : charsStrSayi) {
            System.out.println(charStrSayi);
            // rakama karşılık gelen text'i sonuca ekle

            sonuc += rakamlar[Integer.parseInt(String.valueOf(charStrSayi))];

        }
        return  sonuc.trim();


    }

}