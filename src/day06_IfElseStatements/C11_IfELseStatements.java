package day06_IfElseStatements;

import java.util.Scanner;

public class C11_IfELseStatements {
    public static void main(String[] args) {


        //Kullanicidan bir sayi isteyin
        //sayi 100 den kucuk ise "tebrikleri kazandiniz" yazdirin
        //sayi 100 den kucuk degilse
        //"malesef bu defa olmadi" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        double sayi = scanner.nextDouble();
        if(sayi<100){
            System.out.println("adam kazandi");
            System.out.println("tebrikler kazandiniz");
        }else{
            System.out.println("adam kaybetti");
            System.out.println("Malesef bu sefer olmadi");
        }

        System.out.println("==============================");

        /*
        ıf else cumlelerinde {} kullanmak zorunlu degildir

        ANCAK

        eger suslu parantez kullanmazsanız if body'si olarak sadece tek bir satir kod yazabilirsiniz, 2. satiri
        yazamassiniz

        else 'in devaminda 2. veya daha fazla satir yazilabilir

         */
















       // if(sayi<100) System.out.println("tebrikler kazandiniz");
        //System.out.println("adam kazandi");
        //else System.out.println("Malesef bu sefer olmadi");


    }
}
