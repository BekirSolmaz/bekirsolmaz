package day10_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        String str ="ALi topu at, at Ali at";

        System.out.println(str.contains("Ali"));  //true


        System.out.println(str.contains("at")); //true

        System.out.println(str.contains("ali")); //false

        System.out.println(str.contains("topu Ali")); //false
        System.out.println(str.contains("topu")  && str.contains("Ali")); //ture

        System.out.println(str.contains("topu at")); //true

        System.out.println(str.contains("u a")); //true


        String aciklama ="aa";

        //aciklamada buyuk kucuk harf onemsiz olarak
        //phone geciyor mu?

        System.out.println( aciklama.toLowerCase().contains("phone") ); //true





    }
}
