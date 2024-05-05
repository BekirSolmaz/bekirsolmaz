package day02_variables_scanner;

import java.util.Scanner;

public class C03_Scanner_SayininKaresiniAlma {
    public static void main(String[] args) {

        //kullanıcıdan bir tam sayı isteyip
        //sayinin karesini yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Bir tam sayı giriniz...");

        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayinin Karesi : " + girilenSayi*girilenSayi);


    }
}
