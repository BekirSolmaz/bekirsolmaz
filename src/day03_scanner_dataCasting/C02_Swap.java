package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Swap {
    public static void main(String[] args) {
        //soru 7 (Interview) kullanıcıdan iki sayı alıp ikisinin değerlerini değistirin(Swap)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz...");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz...");
        int sayi2 = scanner.nextInt();


        int temp = 0;
        temp = sayi1 ;

        sayi1 = sayi2;

        sayi2 = temp;

        System.out.println("sayilarin yerini değiştirdim" +
                "\nSayi1 : "  + sayi1 + ", Sayi2 : " + sayi2 + " oldu." );


    }
}
