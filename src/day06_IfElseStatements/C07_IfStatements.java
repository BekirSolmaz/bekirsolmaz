package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfStatements {
    public static void main(String[] args) {


        //kullanicidan notunu isteyin
        //kullanici 0 ile 100 arsında olmyan bir not girerse
        //gecersiz not yazdirin
        //0 ile 100 arsında (sinirlar dahil) bir not girerse
        //gecerli not yazidirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double sayi = scanner.nextDouble();
        if (sayi >=0 && sayi <=100 ){
            System.out.println("Gecerli Not");
        }

        if(sayi < 0 || sayi>100){   //aralıgın dısından bahsediyorsak or olarak yazarız
            System.out.println("gecersiz not");
        }

    }
}
