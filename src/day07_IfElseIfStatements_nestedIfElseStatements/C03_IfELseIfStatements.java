package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C03_IfELseIfStatements {
    public static void main(String[] args) {
        /*
            bize verilen gorevlerdeki siralama farkli olsaad
            if, else if,..   cumlelerinde
         */


        //kullanicidan bir tam sayi isteyin
        //sayi 7 ile bolunuyorsa " 7 nin katı",
        //sayi 5 ile bolunuyıorsa "5in katı"
        //her ikisinede bolunuyorsa "Super sayi"
        //ikisinede bolunemiyorsa "kotu sayi"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanicidan bir tam sayi isteyin");
        int girilensayi = scanner.nextInt();

        if (girilensayi % 7 == 0 && girilensayi % 5 ==0){
            System.out.println("super sayi");
        } else if ( girilensayi % 5 ==0 ) {
            System.out.println("5 in katı");
        } else if ( girilensayi% 7 == 0 ) {
            System.out.println("7 nin kati");

        }else {
            System.out.println("kotu asyi");
        }
    }
}
