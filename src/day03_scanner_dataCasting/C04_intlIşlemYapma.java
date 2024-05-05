package day03_scanner_dataCasting;

public class C04_intlIşlemYapma {
    public static void main(String[] args) {

        int sayi1 = 24;
        int sayi2 = 8 ;
        int sayi3 = 10;
        System.out.println( sayi1 / sayi2);

        System.out.println( sayi1 / sayi3);

        // isleme giren sayilarin ikiside int olduğundan java sonucuda int olarka verir


        double dbl = 24;
        System.out.println( dbl / sayi2 );

        System.out.println( dbl / sayi3 );


        int a = 27;
        int b = 4 ;
        //  a/b yi ondalıklı olarak yazdırın

        // diek bolsek
        System.out.println( a / b );

        double sonuc = a / b ;
        // bolme islemini sonucunu variable a atasak
        System.out.println(sonuc);

       //sayilardan birini double cast edelim
        sonuc = (double) a / b ;
        System.out.println(sonuc);
    }
}
