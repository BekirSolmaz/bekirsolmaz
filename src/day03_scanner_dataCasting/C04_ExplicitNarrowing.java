package day03_scanner_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi1 = 20 ;
        int sayi2 = 130;
        int sayi3 = 140 ;
        int sayi4 = 250;
        int sayi5 = 520;
        int sayi6 = 780;
        double dbl = 24.5;


        int sayi = (int)dbl;

        System.out.println("24.5 integer'a cast edersek :" + sayi);
        byte byt = (byte)sayi1;
        System.out.println("20 integer'a cast edersek :" + byt);

        byt = (byte) sayi2;
        System.out.println("130 integer'a cast edersek :" + byt);

        byt = (byte) sayi3;
        System.out.println("140 integer'a cast edersek :" + byt);

        byt = (byte) sayi4;
        System.out.println("250 integer'a cast edersek :" + byt);
        byt = (byte) sayi5;
        System.out.println("520 integer'a cast edersek :" + byt);
        byt = (byte) sayi6;
        System.out.println("780 integer'a cast edersek :" + byt);






    }
}
