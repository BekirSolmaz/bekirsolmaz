package calismaAlani;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz k:kadın, E:erkek ...");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        if(yas<10 || yas>80 ) {
            System.out.println("Gecersiz yas");

        } else if (yas>=65 && cinsiyet=='E') {
            System.out.println("erkek emekli oldu");

        } else if (yas<65 && cinsiyet == 'E') {
            System.out.println(65-yas + " bu kadar yil calismaniz gerekiyor");


        } else if (yas>=60 && cinsiyet=='K') {
            System.out.println("kadin emekli oldu");
        }else if (yas<60 && cinsiyet == 'k') {
            System.out.println(60-yas + "bu kadar yıl daha calismaniz gerekiyor");



        }else
         System.out.println("lutfen gecerli sayi giriniz");
    }
}
