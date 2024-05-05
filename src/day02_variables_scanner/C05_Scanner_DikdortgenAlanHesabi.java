package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner_DikdortgenAlanHesabi {
    public static void main(String[] args) {


        //soru-4 kullanıcıdan bir d,kdörtgenin 2 kenar uznluğunu alıp
        // dikdortgen alanını yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikdortgenin kenar uzunluklarını giriniz....");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + kenar1*kenar2 );

    }
}
