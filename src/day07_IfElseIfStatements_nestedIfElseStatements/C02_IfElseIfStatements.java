package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        /*
            Verilen gorev sonucunda yazdigimiz kod
            else( geriye kalanlar) ile bitmeyebilir

            EGER
            if, else-if,.... cumleleri else ile bitmiyorsa
            bazi degerler icin hic bir if body'sinin calişmayacagini
            gozonunde bulundurmalıyız.
         */



        //kullanicidan bir sayi alin
        //sayi 0 dan kücüksa "negatif bir sayi yazdirin"
        // negatif olmayan sayılardan tek basamaklı olanlar icin "Rakam"
        //uc basamakli sayilar için "Buyuk sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz....");
        int girilensayi = scanner.nextInt();

        if(girilensayi < 0) System.out.println(" Negatif Sayi");
        else if (girilensayi <10) System.out.println("rakam");
        else if (girilensayi <100 ) System.out.println("SAyi");
        else if (girilensayi < 1000) System.out.println("buyuk sayi");




    }
}
