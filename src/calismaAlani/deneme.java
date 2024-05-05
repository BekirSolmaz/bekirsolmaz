package calismaAlani;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        //kullanicidan rakam iste
        //85 ve üstü AA
        //70-85 arsasi BB
        //60-70 arasi cc
        //50-60 arsi Dc
        //50 asagısı kaldı

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scanner.nextDouble();

        if(sayi<=0 || sayi>=100){
            System.out.println("lütfen gecerli bir sayi giriniz");
        } else if (sayi>=85) {
            System.out.println("AA");

        } else if (sayi>=70 && sayi<85) {
            System.out.println("bb");

        } else if (sayi>=60) {
            System.out.println("cc");

        } else if (sayi>=50) {
            System.out.println("dc");
        }else
            System.out.println("kaldiniz");


    }
}
