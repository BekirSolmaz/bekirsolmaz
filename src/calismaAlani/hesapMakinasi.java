package calismaAlani;

import java.util.Scanner;

public class hesapMakinasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi1 = scanner.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2 = scanner.nextDouble();

        System.out.println("1 == toplama");
        System.out.println("2 == cikarma");
        System.out.println("3 == carpma");
        System.out.println("4 == bolme");

        int secim = scanner.nextInt();

        if (secim ==1) {
            System.out.println(sayi1 +sayi2);
        } else if (secim == 2) {
            System.out.println(sayi1-sayi2);

        } else if (secim == 3) {
            System.out.println(sayi1*sayi2);
        } else if (secim == 4) {
            if (sayi1 % 2 == 0) {
                System.out.println("sayi1  sayi2'ye bolunumez ");
                System.out.println(sayi1 / sayi2);
            } else
                System.out.println("ltfen tekrar sayi giriniz");
        }

    }
}