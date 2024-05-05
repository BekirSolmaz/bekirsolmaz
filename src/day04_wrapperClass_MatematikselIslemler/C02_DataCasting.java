package day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {


        //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin
        //islem yapilan variable ların hepsi int ise java sonucun int kısmını verir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 tam sayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();
        System.out.println("Girilen sayilarin ortalamasi : " + (sayi1+sayi2+sayi3)/3 );

        //bolme isleminde pay veya paydayı double yaparsak suc double olur
        System.out.println("Girilen sayilarin ortalamasi : " + (double) (sayi1+sayi2+sayi3)/3 );

    }
}
