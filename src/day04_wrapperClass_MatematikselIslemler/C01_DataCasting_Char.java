package day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C01_DataCasting_Char {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);
        System.out.println("Gİrdiginiz karakterden bir sonraki karakter:" + (char)(girilenKarakter+1));
        System.out.println("Gİrdiginiz karakterden bir sonraki karakter:" + (char)(girilenKarakter+2));
        System.out.println("Gİrdiginiz karakterden bir sonraki karakter:" + (girilenKarakter+3));


        //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin
    }
}
