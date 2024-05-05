package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner_CemberinCevresi {
    public static void main(String[] args) {

        // soru-6 kullanıcıdan bir çemberin yarıcapını alın
        // cevresini ve alanını yazdırın



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cemberin yarıcapını giriniz.....");
        double yaricap = scanner.nextDouble();


        System.out.println("CAmberin cevresi : " + 2 * 3.14 * yaricap);
        System.out.println("DAirenin alanı : " + 3.14 * yaricap * yaricap);
    }
}
