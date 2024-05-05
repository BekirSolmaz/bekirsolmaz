package day02_variables_scanner;

public class C01_PrimitiveDataTurleri {
    public static void main(String[] args) {

        char chr1 = '0';
        char chr2 = '1';

        byte byt = 10; //bu hafızada 8 bit yer kaplar
        short sh = 10; //bu hafızada 16 bit yer kaplar
        int sayi = 10; //bu hafızada 32 bit yer kaplar
        long lng = 10; //bu hafızada 64 bit yer kaplar

        int sayi1 = 0;
        int sayi2 = 1000;;


        float flt = 1254464121367644f;
        float flt2 = 234F;
        float flt3 = 23.678f;
        double dbl1 = 3.145898656579796;

        /*
        1- boulean  = true-false
        2- char = tek bir karakter  'a' tek tırnak kullanılır
        3-4-5-6 byte,short, int, long = tam sayı barındırır
        7-8 float, double = ondalık sayı barındırır

         */

        //primitve data türleri sadece değer barındırır
        // non- primitive data türleri ise deger ve hazır methodları barındırır

        String str = "JAva Candır";
        System.out.println(str.toUpperCase()); //bu karakterleri büyüttü
        System.out.println(str.toLowerCase()); //buda karakterleri küçülttü

        int not = 10; //isimler küçük harfle başlar
        int Not = 20; // isimlerin büyük harfle baslamsı tavsiye edilmez
        //int not = 30;

        System.out.println(Not);  // 20 yi yazdırır
        String İsim1$_ = "Eghbal";
        //String 1isim //sayı barındırabilir ama sayıyla başlayamaz
        String $isim = "Seher"; // isimlerin $ veya _ iel baslaması tavsiye edilmez

        //int int = 20; //javada tanımlı keywordler isim olarak kullanılamaz

        char isminIlkHarfi = 'a'; // her kelimenin ilk harfi büyük yazılır buna camelcase deniyor

        String str1;
        String str2 = "JAva Güzeldir";
        str1 = "Bence de Güzeldir";





    }
}
