package day06_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin,
                //girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin
       // yoksa girilen karakteri girildigi gibi yazdirin


        Scanner scanner =new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char chr1 = scanner.nextLine().charAt(0);
        if ( Character.isLowerCase( chr1 ) ){
            System.out.println(Character.toUpperCase(chr1));
        }else {
            System.out.println( chr1);
        }

    }
}
