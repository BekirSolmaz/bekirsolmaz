package day04_wrapperClass_MatematikselIslemler;

public class C03_WrapperClasses {
    public static void main(String[] args) {


        int sayi = 20;
        String str = "Java Candir";

        //primitve data turleri sadece deger barindirir
        //non primitive data turleri ise hem deger, hem de hazır metholar barındırır
        System.out.println(str.toUpperCase());

        //java primitive data aturleri ile de bazi metodları kullanabilmemiz iiçin
        //Wrapper classları olusturmustur
        //Wrapper classlar primitive ler ile ayni isimlere sahiptir
        //ancal non-primitive olduklari için class isimleri buyuk harfle başlar
        //Boolean, Chaeacter, Byte, Short, Integer; Long, Float Double

        char chr1 = 'a';

        // chr1 primitive char oldugundan hazir methodlari olmaz

        Character chr2 = 'b';
        System.out.println(chr2.charValue());
        System.out.println(Character.isLowerCase(chr1)); //true
        System.out.println(Character.isDigit(chr1)); //false

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);






    }
}
