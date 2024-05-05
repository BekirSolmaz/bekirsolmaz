package day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        //oru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun


        Scanner scanner =new Scanner(System.in);
        System.out.println("Kullanicidan bir harf alin");
        char harf =scanner.nextLine().charAt(0);
        if (harf == 'o' || harf == 'O' ){
            System.out.println("Ocak");
        }
        if (harf == 's' || harf == 'S' ){
            System.out.println("Subat");
        }
        if (harf == 'm' || harf == 'M' ){
            System.out.println("Mart veya mayis");
        }
        if (harf == 'n' || harf == 'N' ){
            System.out.println("Nisan");
        }
        if (harf == 'h' || harf == 'H' ){
            System.out.println("Haziran");
        }



    }
}
